package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;
import com.ctzj.bss.customer.data.carrier.model.annotation.SerializerCache;

/**
 * 可选包/销售品实体
 * 
 * @author pengzz
 * @date 2017-07-17
 * 
 */
public class AssetPromDto implements Serializable {

	private static final long serialVersionUID = -9221404504927275213L;

	/**
	 * Id
	 */
	@FieldMap(name = "id")
	private String a0;

	/**
	 * 主销售品集成Id
	 */
	@FieldMap(name = "primPromIntegId")
	private String a1;

	/**
	 * 可选包关系
	 */
	@FieldMap(name = {"promRelation","typeCd"})
	private String a2;

	/**
	 * 可选包/促销Id
	 */
	@FieldMap(name = "selectablePromId")
	private String a3;

	/**
	 * 资产Id
	 */
	@FieldMap(name = "assetId")
	private String a5;

	/**
	 * */
	@FieldMap(name = "brandType5")
	private String a6;
	/**
	 * */
	@FieldMap(name = "brandType6")
	private String a7;

	/**
	 * 可选包金额
	 */
	@FieldMap(name = "promAmount")
	private String a8;

	/**
	 * 可选包集成Id
	 */
	@FieldMap(name = "selectablePromIntegId")
	private String a9;

	/**
	 * 客户Id
	 */
	@FieldMap(name = "accountId")
	private String b1;

	/**
	 * 可选包/促销类型
	 */
	@FieldMap(name = "selectablePromType")
	private String b4;

	/**
	 * 资产集成Id
	 */
	@FieldMap(name = "assetIntegId")
	private String b5;

	/**
	 * 资产行项目Id(缓存主键)
	 */
	@FieldMap(name = "parRowId")
	private String b6;

	/**
	 * 父行项目Id
	 */
	@FieldMap(name = "parentObjectId")
	private String b7;

	/**
	 * 产品Id
	 */
	@FieldMap(name = "productId")
	private String b8;

	/**
	 * 可选包/促销失效方式
	 */
	@FieldMap(name = "selectableInEffectiveMode")
	private String c0;

	/**
	 * 可选包/促销生效方式
	 */
	@FieldMap(name = "selectableEffectiveMode")
	private String c3;

	/**
	 * 主销售品Id
	 */
	@FieldMap(name = "primaryPromotionId")
	private String c4;

	/**
	 * 主资产Id
	 */
	@FieldMap(name = "rootAssetId")
	private String c5;

	/**
	 * 主产品id
	 */
	@FieldMap(name = "rootProductId")
	private String c6;
	/**
	 * 可选包开始时间
	 */
	@FieldMap(name = "selectablePromStartDate")
	private Date c8;

	/**
	 * 可选包/促销结束时间
	 */
	@FieldMap(name = "selectablePromEndDate")
	private Date c9;

	/**
	 * 外部资产ID
	 */
	@FieldMap(name = "hqOfferInstId")
	private String d0;

	/**
	 * 创建时间
	 */
	@FieldMap(name = "createdDate")
	private Date d2;

	/**
	 * 关联包资产
	 */
	@FieldMap(name = "relIntegId")
	private String e0;

	/**
	 * 关联类型
	 */
	@FieldMap(name = "relType")
	private String e1;

	/**
	 * 流量不清零标记(销售品参数处理时对该字段赋值)
	 */
	@FieldMap(name = "forwardFlag")
	private String e4;

	/**
	 * 内容属性
	 */
	@FieldMap(name = "contAttr")
	private String e5;

	/**
	 * 补贴金额
	 */
	@FieldMap(name = "allowAmount")
	private Double e6;

	/**
	 * 可选包有效时长
	 */
	@FieldMap(name = "serviceLength")
	private String e7;

	/**
	 * 包参数Id（根据属性值反查时使用）
	 */
	@FieldMap(name = "promAttrId")
	private String e8;

	/**
	 * 协议到期时间
	 */
	@FieldMap(name = "promPrintEndDate")
	private String e9;

	/**
	 * 销售品参数列表
	 */
	@SerializerCache
	private List<? extends AssetPromXaDto> f3;

	@FieldMap(name="selectablePromStatus")
	private String f2;

	/**
	 * 协议开始时间 @TODO mapper无映射
	 */
	@FieldMap(name = "agreeStartDt")
	private Date f4;

	/**
	 * 协议结束时间 @TODO mapper无映射
	 */
	@FieldMap(name = "agreeEndDt")
	private Date f5;

	/**
	 * 资产状态
	 */
	@FieldMap(name = "assetStatus")
	private String f6;

	/**
	 * 名称 @TODO mapper中未映射
	 */
	@FieldMap(name="name")
	private String f7;
	
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

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
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

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
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

	public String getC0() {
		return c0;
	}

	public void setC0(String c0) {
		this.c0 = c0;
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

	public Date getC8() {
		return c8;
	}

	public void setC8(Date c8) {
		this.c8 = c8;
	}

	public Date getC9() {
		return c9;
	}

	public void setC9(Date c9) {
		this.c9 = c9;
	}

	public String getD0() {
		return d0;
	}

	public void setD0(String d0) {
		this.d0 = d0;
	}

	public Date getD2() {
		return d2;
	}

	public void setD2(Date d2) {
		this.d2 = d2;
	}

	public String getE0() {
		return e0;
	}

	public void setE0(String e0) {
		this.e0 = e0;
	}

	public String getE1() {
		return e1;
	}

	public void setE1(String e1) {
		this.e1 = e1;
	}

	public String getE4() {
		return e4;
	}

	public void setE4(String e4) {
		this.e4 = e4;
	}

	public String getE5() {
		return e5;
	}

	public void setE5(String e5) {
		this.e5 = e5;
	}

	public Double getE6() {
		return e6;
	}

	public void setE6(Double e6) {
		this.e6 = e6;
	}

	public String getE7() {
		return e7;
	}

	public void setE7(String e7) {
		this.e7 = e7;
	}

	public String getE8() {
		return e8;
	}

	public void setE8(String e8) {
		this.e8 = e8;
	}

	public String getE9() {
		return e9;
	}

	public void setE9(String e9) {
		this.e9 = e9;
	}

	public List<? extends AssetPromXaDto> getF3() {
		return f3;
	}

	public void setF3(List<? extends AssetPromXaDto> f3) {
		this.f3 = f3;
	}


	public String getF2() {
		return f2;
	}

	public void setF2(String f2) {
		this.f2 = f2;
	}

	public String getF7() {
		return f7;
	}

	public void setF7(String f7) {
		this.f7 = f7;
	}

	public Date getF4() {
		return f4;
	}

	public void setF4(Date f4) {
		this.f4 = f4;
	}

	public Date getF5() {
		return f5;
	}

	public void setF5(Date f5) {
		this.f5 = f5;
	}

	public String getF6() {
		return f6;
	}

	public void setF6(String f6) {
		this.f6 = f6;
	}

}
