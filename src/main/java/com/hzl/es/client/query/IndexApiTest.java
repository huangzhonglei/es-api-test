package com.hzl.es.client.query;
import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

import java.net.InetAddress;
import java.util.Date;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

public class IndexApiTest {

	@Test
	public void test1() throws Exception{
		XContentBuilder builder = jsonBuilder()
			    .startObject()
			        .field("user", "kimchy")
			        .field("postDate", new Date())
			        .field("message", "trying out Elasticsearch")
			    .endObject();
		String json = builder.string();
		System.out.println(json);
	}
	
		
	@Test
	public void test2() throws Exception{
		Settings settings = Settings.builder().put("cluster.name", "elasticsearch").build();
		//创建client
		TransportClient client = new PreBuiltTransportClient(settings)
		        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
		IndexResponse response = client.prepareIndex("twitter", "tweet", "1")
		        .setSource(jsonBuilder()
		                    .startObject()
		                        .field("user", "kimchy")
		                        .field("postDate", new Date())
		                        .field("message", "trying out Elasticsearch")
		                    .endObject()
		                  )
		        .get();
		// Index name
		String _index = response.getIndex();
		// Type name
		String _type = response.getType();
		// Document ID (generated or not)
		String _id = response.getId();
		// Version (if it's the first time you index this document, you will get: 1)
		long _version = response.getVersion();
		// status has stored current instance statement.
		RestStatus status = response.status();
	}
	
	
}
