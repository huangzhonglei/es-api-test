package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;

import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;
/**
 * 
 * @Description: 销售品配置表
 * @author pengzz
 * @date 2017年10月28日
 *
 */
public class PromDto implements Serializable {

	private static final long serialVersionUID = -144877678724821417L;

	/**
	 * 
	 */
	@FieldMap(name = {"selectablePromNum","promotionNbr"})
	private String a;

	/**
	 * 
	 */
	@FieldMap(name = "finalPromNbr")
	private String b;

	/**
	 * 
	 */
	@FieldMap(name = {"promotionName","selectablePromName"})
	private String c;

	/**
	 * 
	 */
	@FieldMap(name = "isOld")
	private String d;

	/**
	 * 
	 */
	@FieldMap(name = "selectablePromSaleFlag")
	private String e;

	/**
	 * 
	 */
	@FieldMap(name = "promType")
	private String f;

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

}
