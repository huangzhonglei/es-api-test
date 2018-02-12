package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;

import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;

/**
 * 
 * @Description: 销售品参数属性实体
 * @author pengzz
 * @date 2017年10月14日
 *
 */
public class AssetPromXaAttrDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4697374546196614422L;

	/**
	 * rowId
	 */
	private String a;

	/**
	 * 属性名称 X_ATTRIB_NAME(销售品 forwardFlag 判断条件)
	 */
	private String b;

	/**
	 * 属性类型
	 */
	@FieldMap(name = "attrType")
	private String c;

	/**
	 * 属性输入类型
	 */
	@FieldMap(name = "attrInputType")
	private String d;

	/**
	 * lov类型
	 */
	@FieldMap(name = "attrLovType")
	private String e;

	/**
	 * 属性值类型
	 */
	@FieldMap(name = "attrValueType")
	private String f;

	/**
	 * 是否必须
	 */
	@FieldMap(name = "isNeed")
	private String g;

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

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

}
