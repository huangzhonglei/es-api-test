package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;

import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;

/**
 * 资产属性实体
 * 
 * @author pengzz
 * @date 2017-07-17
 */
public class AssetXaDto implements Serializable {

	private static final long serialVersionUID = 8509663652491093781L;

	/**
	 * Id
	 */
	@FieldMap(name = "id")
	private String a;

	/**
	 * 属性显示值
	 */
	@FieldMap(name = "displayName")
	private String b;

	/**
	 * 属性名称 by fj
	 */
	@FieldMap(name = {"attrName","addrName"})
	private String d;

	/**
	 * 属性值 将NUM_VAL，DATE_VAL，CHAR_VAL的值取出来放进这个字段
	 */
	@FieldMap(name = "value")
	private String e;

	/**
	 * 是否显示属性信息
	 */
	@FieldMap(name = "hidden")
	private String f;

	@FieldMap(name = "lovTypeCd")
	private String g;

	@FieldMap(name = "readOnlyFlag")
	private String h;

	@FieldMap(name = "dataTypeCd")
	private String i;

	@FieldMap(name = "requiredFlag")
	private String j;

	/**
	 * 主资产 integration_id
	 */
	@FieldMap(name = "assetIntegId")
	private String k;

	@FieldMap(name = "assetId")
	private String m;

	/**
	 * 对应crm表row_id，集团上传接口实例id为该字段
	 */
	@FieldMap(name = "attrRowId")
	private String n;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public String getH() {
		return h;
	}

	public void setH(String h) {
		this.h = h;
	}

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

}
