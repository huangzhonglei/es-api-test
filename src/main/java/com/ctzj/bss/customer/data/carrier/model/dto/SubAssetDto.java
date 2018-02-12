package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.ctzj.bss.customer.data.carrier.model.annotation.CacheIgnore;
import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;
import com.ctzj.bss.customer.data.carrier.model.annotation.SerializerCache;

/**
 * 子资产实体类
 * 
 * @author pengzz
 * @date 2017-7-17
 * 
 */
public class SubAssetDto implements Serializable {

	private static final long serialVersionUID = -4472154623975406835L;
	/**
	 * ROWId
	 */
	@FieldMap(name = "id")
	private String a0;

	/**
	 * 关联资产Id
	 */
	@FieldMap(name = "reatedAssetId")
	private String a1;

	/** 父资产Id */
	@FieldMap(name = "parAssetId")
	private String a2;

	/* 安装日期 */
	@FieldMap(name = "competedDate")
	private Date a3;

	/* 综合业务号码 */
	@FieldMap(name = "integrationNum")
	private String a4;

	/* VPN群号,将Centrex群号，VPN群号，WAC群号合并 */
	@FieldMap(name = "vpnGroupId")
	private String a5;

	/* VPN小号，将Centrex小号，VPN小号，WAC小号合并 */
	@FieldMap(name = "vpnInnerId")
	private String a6;

	/* 资产集成Id */
	@FieldMap(name = "integrationId")
	private String a7;

	/* 产品Id */
	@FieldMap(name = "productId")
	private String a8;

	/* 资产状态 */
	@FieldMap(name = "status")
	private String a9;

	@FieldMap(name = "promIntegrationId")
	private String b3;

	/**
	 * 群组优惠协议号
	 */
	@FieldMap(name = "agreementId")
	private String b4;

	/**
	 * 主资产ID
	 */
	@FieldMap(name = "rootAssetId")
	private String b5;

	/**
	 * 群组结束时间
	 */
	@FieldMap(name = "siGroupEndEate")
	private String b6;

	/**
	 * 群组开始时间
	 */
	@FieldMap(name = "siGroupStartDate")
	private String b7;

	/**
	 * 服务失效时间
	 */
	@FieldMap(name = "effectiveEndDate")
	private String b8;

	/**
	 * 服务生效时间
	 */
	@FieldMap(name = "effectiveStartDate")
	private String b9;

	/**
	 * 安装日期
	 */
	@FieldMap(name = "installDate")
	private String c0;

	/**
	 * 服务时长
	 */
	@FieldMap(name = "serviceLength")
	private String c1;
	/**
	 * 主产品IntegrationId
	 */
	@FieldMap(name = "rootIntegrationId")
	private String c2;

	/**
	 * 
	 */
	@FieldMap(name = "rootIntegrationNum")
	private String c3;

	/**
	 * c3
	 */
	@FieldMap(name = "c3Name")
	private String c4;

	/**
	 * 
	 */
	@FieldMap(name = "hqServiceId")
	private String c5;

	/**
	 * 
	 */
	@FieldMap(name = "hqProductId")
	private String c6;

	/**
	 * 电话号码
	 */
	@FieldMap(name = "serviceId")
	private String c7;

	/**
	 * 资产属性列表
	 */
	@SerializerCache
	private List<AssetXaDto> c8;

	/**
	 * 中继引示号
	 */
	@FieldMap(name = "relayMainNumber")
	private String c9;

	/**
	 * 群组优惠
	 */
	@FieldMap(name = "agreementName")
	private String d0;

	/**
	 * 群组名(特殊处理)
	 */
	@CacheIgnore
	@FieldMap(name = "groupName")
	private String d1;
	/**
	 * 客户Id @TODO mapper 字段未映射
	 */
	@FieldMap(name = "ownerAccountId")
	private String d2;

	/**
	 * 接入管道编号
	 */
	@FieldMap(name = "snNo")
	private String d3;

	public String getA0() {
		return a0;
	}

	public void setA0(String a0) {
		this.a0 = a0;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public Date getA3() {
		return a3;
	}

	public void setA3(Date a3) {
		this.a3 = a3;
	}

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	public String getA5() {
		return a5;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

	public String getA6() {
		return a6;
	}

	public void setA6(String a6) {
		this.a6 = a6;
	}

	public String getA7() {
		return a7;
	}

	public void setA7(String a7) {
		this.a7 = a7;
	}

	public String getA8() {
		return a8;
	}

	public void setA8(String a8) {
		this.a8 = a8;
	}

	public String getA9() {
		return a9;
	}

	public void setA9(String a9) {
		this.a9 = a9;
	}

	public String getB3() {
		return b3;
	}

	public void setB3(String b3) {
		this.b3 = b3;
	}

	public String getB4() {
		return b4;
	}

	public void setB4(String b4) {
		this.b4 = b4;
	}

	public String getB5() {
		return b5;
	}

	public void setB5(String b5) {
		this.b5 = b5;
	}

	public String getB6() {
		return b6;
	}

	public void setB6(String b6) {
		this.b6 = b6;
	}

	public String getB7() {
		return b7;
	}

	public void setB7(String b7) {
		this.b7 = b7;
	}

	public String getB8() {
		return b8;
	}

	public void setB8(String b8) {
		this.b8 = b8;
	}

	public String getB9() {
		return b9;
	}

	public void setB9(String b9) {
		this.b9 = b9;
	}

	public String getC0() {
		return c0;
	}

	public void setC0(String c0) {
		this.c0 = c0;
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public String getC4() {
		return c4;
	}

	public void setC4(String c4) {
		this.c4 = c4;
	}

	public String getC5() {
		return c5;
	}

	public void setC5(String c5) {
		this.c5 = c5;
	}

	public String getC6() {
		return c6;
	}

	public void setC6(String c6) {
		this.c6 = c6;
	}

	public String getC7() {
		return c7;
	}

	public void setC7(String c7) {
		this.c7 = c7;
	}

	public List<AssetXaDto> getC8() {
		return c8;
	}

	public void setC8(List<AssetXaDto> c8) {
		this.c8 = c8;
	}

	public String getC9() {
		return c9;
	}

	public void setC9(String c9) {
		this.c9 = c9;
	}

	public String getD0() {
		return d0;
	}

	public void setD0(String d0) {
		this.d0 = d0;
	}

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	public String getD2() {
		return d2;
	}

	public void setD2(String d2) {
		this.d2 = d2;
	}

	public String getD3() {
		return d3;
	}

	public void setD3(String d3) {
		this.d3 = d3;
	}

}
