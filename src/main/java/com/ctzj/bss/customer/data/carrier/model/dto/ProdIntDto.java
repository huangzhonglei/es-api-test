package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;

import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;

public class ProdIntDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3253586578177087171L;

	/**
	 * 
	 */
	@FieldMap(name = {"productName","prodctName"})
	private String a;

	/**
	 * 
	 */
	@FieldMap(name = {"productCode","productNbr","productNum"})
	private String b;

	/**
	 * 
	 */
	@FieldMap(name = "NetworkElementType")
	private String c;

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

}
