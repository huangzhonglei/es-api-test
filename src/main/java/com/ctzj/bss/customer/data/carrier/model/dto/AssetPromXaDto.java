package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;

import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;

/**
 * 销售品参数实体类
 * 
 * @author pengzz
 * @date 2017-07-17
 * 
 */
public class AssetPromXaDto implements Serializable {

	private static final long serialVersionUID = 8467426929031593559L;

	/**
	 * Id
	 */
	@FieldMap(name = "id")
	private String a;

	/**
	 * 值
	 */
	@FieldMap(name = "attrValue")
	private String c;

	/**
	 * 输入值
	 */
	@FieldMap(name = {"attrInputType","attrDisplayValue"})
	private String d;

	/**
	 * 名称
	 */
	@FieldMap(name = "attrName")
	private String e;

	/**
	 * 包实例Id
	 */
	@FieldMap(name = "parId")
	private String f;

	@FieldMap(name = "attrId")
	private String j;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
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

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}
}
