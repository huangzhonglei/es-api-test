package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.ctzj.bss.customer.data.carrier.model.annotation.CacheIgnore;
import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;
import com.ctzj.bss.customer.data.carrier.model.annotation.SerializerCache;

/**
 * 主资产实体类
 * 
 * @author pengzz
 * @date 2017-07-17
 */
public class AssetDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3205254989223326170L;
	/**
	 * Asset Id
	 */
	@FieldMap(name = "id")
	private String a0;

	/**
	 * 最后更新时间
	 */
	@FieldMap(name = "lastUpd")
	private Date a1;

	/**
	 * 综合业务号码
	 */
	@FieldMap(name = { "integrationNum", "assetIntegNum" })
	private String a2;

	/**
	 * 资产状态
	 */
	@FieldMap(name = { "rootAssetStatus", "status" })
	private String a3;

	/**
	 * 专线编号
	 */
	@FieldMap(name = "circuitNumber")
	private String a4;

	/**
	 * 销售品集成ID
	 */
	@FieldMap(name = "promotionIntegrationId")
	private String a7;

	/**
	 * 销售品头标识
	 */
	@FieldMap(name = "promotionFlag")
	private String a8;

	/**
	 * 关联资产ID
	 */
	@FieldMap(name = "relatedAssetId")
	private String a9;

	/**
	 * 产品Id
	 */
	@FieldMap(name = "productId")
	private String b0;

	/**
	 * 安装日期
	 */
	@FieldMap(name = "completedDate")
	private Date b3;

	/**
	 * 主辅号标志
	 */
	@FieldMap(name = "mainNumberFlg")
	private String b4;

	/**
	 * 资产集成编号
	 */
	@FieldMap(name = "integrationId")
	private String b5;

	/**
	 * 用户身份
	 */
	@FieldMap(name = "userIdentify")
	private String b6;

	/**
	 * 宽带账号
	 */
	@FieldMap(name = "networkAccount")
	private String b7;

	/**
	 * 电话号码
	 */
	@FieldMap(name = { "serialNumber", "serviceId" })
	private String b8;

	/**
	 * 欠费停机标示，单项欠费停机，双向欠费停机
	 */
	@FieldMap(name = "suspendFlag")
	private String b9;

	/**
	 * 挂失停机
	 */
	@FieldMap(name = "lossSuspendFlag")
	private String c0;

	/**
	 * 主动停机标识
	 */
	@FieldMap(name = "initiativeSuspend")
	private String c1;

	/**
	 * 违章停机标识
	 */
	@FieldMap(name = "peccancySuspend")
	private String c2;

	/**
	 * 免停标识
	 */
	@FieldMap(name = "noSuspendFlag")
	private String c3;

	/**
	 * 免催标识
	 */
	@FieldMap(name = "noCallFlag")
	private String c4;

	/**
	 * 不提醒
	 */
	@FieldMap(name = "noRemindFlag")
	private String c5;

	/**
	 * 小户名ID
	 */
	@FieldMap(name = "userAliasId")
	private String c6;

	/**
	 * 小户名
	 */
	@FieldMap(name = "userAlias")
	private String c7;

	/**
	 * 用户证件类型
	 */
	@FieldMap(name = "userAliasIdType")
	private String c8;

	/**
	 * 用户证件编码
	 */
	@FieldMap(name = "userAliasdNumber")
	private String c9;

	/**
	 * 用户地址
	 */
	@FieldMap(name = "userAliasC3Name")
	private String d0;

	/**
	 * 客户证件号码
	 * 
	 * @FieldMap(name = "accountIdNumber") private String d3;
	 */

	/**
	 * 客户证件类型
	 * 
	 * @FieldMap(name = "accountIdType") private String d4;
	 */

	/**
	 * 客户Row ID
	 */
	@FieldMap(name = "accountId")
	private String d5;

	/**
	 * 客户名称
	 * 
	 * @FieldMap(name = "accountName") private String d6;
	 */

	/**
	 * 帐户ROWID
	 */
	@FieldMap(name = "billAccountId")
	private String d8;

	/**
	 * 服务地址Id
	 */
	@FieldMap(name = "serviceAddressId")
	private String e1;

	/**
	 * 营业区 id
	 */
	@FieldMap(name = "c4Id")
	private String e2;

	/**
	 * 支局局向
	 */
	@FieldMap(name = "c5Id")
	private String e4;

	/**
	 * 地址局向
	 */
	@FieldMap(name = "c6Id")
	private String e5;

	/**
	 * 星级
	 */
	@FieldMap(name = "assetGrade")
	private String e6;

	/**
	 * 客户经理联系人
	 */
	@FieldMap(name = "accountManager")
	private String e7;

	/**
	 * 客户经理联系人电话
	 */
	@FieldMap(name = "accountManagerPhone")
	private String e8;

	/**
	 * 割接标志
	 */
	@FieldMap(name = "exchangeFlag")
	private String e9;

	/**
	 * 关联地址编号
	 */
	@FieldMap(name = "addRelationId")
	private String f0;

	/**
	 * 资产关联销售品名称
	 */
	@FieldMap(name = "promotionName")
	private String f2;

	/**
	 * 资产关联销售品ID
	 */
	@FieldMap(name = "promotionId")
	private String f3;

	/**
	 * 网络
	 */
	@FieldMap(name = "compoundProductNumber")
	private String f4;

	/**
	 * 安装日期
	 */
	@FieldMap(name = "startDate")
	private Date f7;

	/**
	 * 资产实例是否属于4g套餐
	 */
	@FieldMap(name = "xLteFlag")
	private String f8;

	/**
	 * 外部产品实例标识
	 */
	@FieldMap(name = { "extProdInstId", "hqServiceId" })
	private String f9;

	/**
	 * 预开户状态,X_PRE_OPEN_ACC_STATUS
	 */
	@FieldMap(name = "preOpenSt")
	private String g0;

	/**
	 * 加装标记 X_ADDITIONAL_FLAG
	 */
	@FieldMap(name = { "additionalFlag", "addFlag", "addFlg" })
	private String g1;

	/**
	 * 
	 */
	@FieldMap(name = "createDate")
	private Date g2;

	/**
	 * 
	 */
	@FieldMap(name = "rootIntegrationId")
	private String g3;

	/**
	 * 
	 */
	@FieldMap(name = "rootExtProdInstId")
	private String g4;

	/**
	 * 
	 */
	@FieldMap(name = "rootAssetId")
	private String g5;

	/**
	 * 销售品外部ID
	 */
	@FieldMap(name = "extOfferInstId")
	private String g6;

	/**
	 * 管道编号
	 */
	@FieldMap(name = "snNo")
	private String g7;

	/**
	 * 品牌类型
	 */
	@FieldMap(name = "brandType")
	private String g9;

	/**
	 * 97地址ID
	 */
	@FieldMap(name = "addr97Id")
	private String h0;

	/**
	 * 4G品牌标识或宽带尊享标识
	 */
	@FieldMap(name = "broadBandService")
	private String h1;

	/**
	 * 客户经理关联ID
	 */
	@FieldMap(name = "managerId")
	private String h2;

	/**
	 * 客户经理电话
	 */
	@FieldMap(name = "managerPhone")
	private String h3;

	/**
	 * 局向名称
	 */
	@FieldMap(name = "c6Name")
	private String h4;

	/**
	 * 
	 */
	@FieldMap(name = "communityId")
	private String h5;

	/**
	 * 
	 */
	@FieldMap(name = "communityName")
	private String h6;

	/**
	 * 电路编号
	 */
	@FieldMap(name = "dependentCircuitNumber")
	private String h7;

	/**
	 * 邮箱编号
	 */
	@FieldMap(name = "emailAccount")
	private String h8;

	/**
	 * 电子传真号码
	 */
	@FieldMap(name = "faxNumber")
	private String h9;

	/**
	 * 录入线路编号
	 */
	@FieldMap(name = "lineNumber")
	private String i0;

	/**
	 * 
	 */
	@FieldMap(name = "relayMainNumber")
	private String i1;

	/**
	 * 群组结束时间
	 */
	@FieldMap(name = "siGroupEndEate")
	private Date i2;

	/**
	 * 群组起始时间
	 */
	@FieldMap(name = "siGroupStartDate")
	private Date i3;

	/**
	 * 特服号
	 */
	@FieldMap(name = "specServiceNumber")
	private String i4;

	/**
	 * VPN6000群号
	 */
	@FieldMap(name = "vpnGroupId")
	private String i5;

	/**
	 * VPN6000小号
	 */
	@FieldMap(name = "vpnInnerId")
	private String i6;

	/**
	 * WAC群号
	 */
	@FieldMap(name = "wacGroupId")
	private String i7;

	/**
	 * WAC小号
	 */
	@FieldMap(name = "wacInnerId")
	private String i8;

	/**
	 * Centrex群号
	 */
	@FieldMap(name = "centrexGroupId")
	private String i9;

	/**
	 * Centrex小号
	 */
	@FieldMap(name = "centrexInnerId")
	private String j0;

	/**
	 * 服务结束日期
	 */
	@FieldMap(name = "effectiveEndDate")
	private String j1;

	/**
	 * 服务开始日期
	 */
	@FieldMap(name = "effectiveStartDate")
	private String j2;

	/**
	 * 服务时长
	 */
	@FieldMap(name = "serviceLength")
	private String j3;

	/**
	 * 
	 */
	@FieldMap(name = "CLLI")
	private String j4;

	/**
	 * 
	 */
	@FieldMap(name = "Node")
	private String j6;

	/**
	 * 
	 */
	@FieldMap(name = "portNum")
	private String j7;

	/**
	 * 
	 */
	@FieldMap(name = "prefix")
	private String j8;
	/**
	 * 
	 */
	@FieldMap(name = "servicePointId")
	private String j9;
	/**
	 * 
	 */
	@FieldMap(name = "agreementId")
	private String k0;
	/**
	 * 预受理表示
	 */
	@FieldMap(name = "preOperFlag")
	private String k1;

	/**
	 * 
	 */
	@FieldMap(name = "assetDescription")
	private String k3;
	/**
	 * 集团产品编码
	 */
	@FieldMap(name = "hqProductId")
	private String k4;
	/**
	 * 国漫保证金冻结流水号
	 */
	@FieldMap(name = "ocsNum")
	private String k5;
	/**
	 * 联系人id
	 */
	@FieldMap(name = "shipToContactId")
	private String k6;

	/**
	 * 资产属性列表
	 */
	@SerializerCache
	private List<AssetXaDto> k7;
	/**
	 * 子资产列表
	 */
	@CacheIgnore
	private List<SubAssetDto> subAssetDtoList;
	/**
	 * 销售品列表
	 */
	@CacheIgnore
	private List<AssetPromDto> assetPromDtoList;
	/**
	 * 资产标准价格
	 */
	@FieldMap(name = "purchAdjUnitPrice")
	private Double k8;
	/**
	 * 担保资产
	 */
	@FieldMap(name = "assurerId")
	private String k9;
	/**
	 * 品牌金额
	 */
	@FieldMap(name = "brandAmount")
	private String m0;
	/**
	 * 代理商Id
	 */
	@FieldMap(name = "channelId")
	private String m1;
	/**
	 * 渠道细分
	 */
	@FieldMap(name = "channelSubType")
	private String m2;
	/**
	 * 渠道
	 */
	@FieldMap(name = "channelType")
	private String m3;
	/**
	 * 同址资产Id
	 */
	@FieldMap(name = "sameAddrRelationId")
	private String m4;
	/**
	 * 账户邮件地址
	 */
	@FieldMap(name = "billingMailingAdd")
	private String m5;
	/**
	 * 网格编码
	 */
	@FieldMap(name = "communityNumber")
	private String m6;
	/**
	 * 
	 */
	@FieldMap(name = "payGreenNet")
	private String m7;
	/**
	 * 担保资产id
	 */
	@FieldMap(name = "assurAssetId")
	private String m8;
	/**
	 * 资产锁定标识
	 */
	@FieldMap(name = "prPepManlFlg")
	private String m9;

	/**
	 * 集团用户标识
	 */
	@FieldMap(name = "jtAccountFlag")
	private String n1;
	/** 选址相关参数 */
	/**
	 * 城乡标志
	 */
	@FieldMap(name = "customeridentity")
	private String n2;

	/**
	 * 房间Id
	 */
	@FieldMap(name = "roomId")
	private String n3;

	/**
	 * 加装资产编号 @TODO mapper中暂未查询
	 */
	@FieldMap(name = "addRelAssetNum")
	private String n4;

	/**
	 * 网点名称 @TODO mapper中暂未查询
	 */
	@FieldMap(name = "branchName")
	private String n5;

	/**
	 * 联系人 @TODO mapper中暂未查询
	 */
	@FieldMap(name = "contactName")
	private String n6;

	/**
	 * 联系电话 @TODO mapper中暂未查询
	 */
	@FieldMap(name = "contactPhoneNum")
	private String n7;

	/**
	 * 群号名 @TODO mapper中暂未查询
	 */
	@FieldMap(name = "groupName")
	private String n8;

	/**
	 * 流量不清零标记
	 */
	@FieldMap(name = "forwardFlag")
	private String n9;

	/**
	 * 关联资产编号 @TODO mapper中暂未查询
	 */
	@FieldMap(name = "relAssetNum")
	private String o1;

	/**
	 * 用户客户编码 @TODO 需要特殊处理
	 */
	@FieldMap(name = "userAliasOuNum")
	private String o2;

	/**
	 * 销售区域 (公共服务平台特有字段)
	 */
	@FieldMap(name = "salesArea")
	private String o3;

	/**
	 * 资产过期标识 @Fixme 如果为Y 则标识为过期
	 */
	private String o4;

	public String getA0() {
		return a0;
	}

	public void setA0(String a0) {
		this.a0 = a0;
	}

	public Date getA1() {
		return a1;
	}

	public void setA1(Date a1) {
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

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
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

	public String getB0() {
		return b0;
	}

	public void setB0(String b0) {
		this.b0 = b0;
	}

	public Date getB3() {
		return b3;
	}

	public void setB3(Date b3) {
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

	public String getC8() {
		return c8;
	}

	public void setC8(String c8) {
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

	public String getD8() {
		return d8;
	}

	public void setD8(String d8) {
		this.d8 = d8;
	}

	public String getE1() {
		return e1;
	}

	public void setE1(String e1) {
		this.e1 = e1;
	}

	public String getE2() {
		return e2;
	}

	public void setE2(String e2) {
		this.e2 = e2;
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

	public String getE6() {
		return e6;
	}

	public void setE6(String e6) {
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

	public String getF0() {
		return f0;
	}

	public void setF0(String f0) {
		this.f0 = f0;
	}

	public String getF2() {
		return f2;
	}

	public void setF2(String f2) {
		this.f2 = f2;
	}

	public String getF3() {
		return f3;
	}

	public void setF3(String f3) {
		this.f3 = f3;
	}

	public String getF4() {
		return f4;
	}

	public void setF4(String f4) {
		this.f4 = f4;
	}

	public Date getF7() {
		return f7;
	}

	public void setF7(Date f7) {
		this.f7 = f7;
	}

	public String getF8() {
		return f8;
	}

	public void setF8(String f8) {
		this.f8 = f8;
	}

	public String getF9() {
		return f9;
	}

	public void setF9(String f9) {
		this.f9 = f9;
	}

	public String getG0() {
		return g0;
	}

	public void setG0(String g0) {
		this.g0 = g0;
	}

	public String getG1() {
		return g1;
	}

	public void setG1(String g1) {
		this.g1 = g1;
	}

	public Date getG2() {
		return g2;
	}

	public void setG2(Date g2) {
		this.g2 = g2;
	}

	public String getG3() {
		return g3;
	}

	public void setG3(String g3) {
		this.g3 = g3;
	}

	public String getG4() {
		return g4;
	}

	public void setG4(String g4) {
		this.g4 = g4;
	}

	public String getG5() {
		return g5;
	}

	public void setG5(String g5) {
		this.g5 = g5;
	}

	public String getG6() {
		return g6;
	}

	public void setG6(String g6) {
		this.g6 = g6;
	}

	public String getG7() {
		return g7;
	}

	public void setG7(String g7) {
		this.g7 = g7;
	}

	public String getG9() {
		return g9;
	}

	public void setG9(String g9) {
		this.g9 = g9;
	}

	public String getH0() {
		return h0;
	}

	public void setH0(String h0) {
		this.h0 = h0;
	}

	public String getH1() {
		return h1;
	}

	public void setH1(String h1) {
		this.h1 = h1;
	}

	public String getH2() {
		return h2;
	}

	public void setH2(String h2) {
		this.h2 = h2;
	}

	public String getH3() {
		return h3;
	}

	public void setH3(String h3) {
		this.h3 = h3;
	}

	public String getH4() {
		return h4;
	}

	public void setH4(String h4) {
		this.h4 = h4;
	}

	public String getH5() {
		return h5;
	}

	public void setH5(String h5) {
		this.h5 = h5;
	}

	public String getH6() {
		return h6;
	}

	public void setH6(String h6) {
		this.h6 = h6;
	}

	public String getH7() {
		return h7;
	}

	public void setH7(String h7) {
		this.h7 = h7;
	}

	public String getH8() {
		return h8;
	}

	public void setH8(String h8) {
		this.h8 = h8;
	}

	public String getH9() {
		return h9;
	}

	public void setH9(String h9) {
		this.h9 = h9;
	}

	public String getI0() {
		return i0;
	}

	public void setI0(String i0) {
		this.i0 = i0;
	}

	public String getI1() {
		return i1;
	}

	public void setI1(String i1) {
		this.i1 = i1;
	}

	public Date getI2() {
		return i2;
	}

	public void setI2(Date i2) {
		this.i2 = i2;
	}

	public Date getI3() {
		return i3;
	}

	public void setI3(Date i3) {
		this.i3 = i3;
	}

	public String getI4() {
		return i4;
	}

	public void setI4(String i4) {
		this.i4 = i4;
	}

	public String getI5() {
		return i5;
	}

	public void setI5(String i5) {
		this.i5 = i5;
	}

	public String getI6() {
		return i6;
	}

	public void setI6(String i6) {
		this.i6 = i6;
	}

	public String getI7() {
		return i7;
	}

	public void setI7(String i7) {
		this.i7 = i7;
	}

	public String getI8() {
		return i8;
	}

	public void setI8(String i8) {
		this.i8 = i8;
	}

	public String getI9() {
		return i9;
	}

	public void setI9(String i9) {
		this.i9 = i9;
	}

	public String getJ0() {
		return j0;
	}

	public void setJ0(String j0) {
		this.j0 = j0;
	}

	public String getJ1() {
		return j1;
	}

	public void setJ1(String j1) {
		this.j1 = j1;
	}

	public String getJ2() {
		return j2;
	}

	public void setJ2(String j2) {
		this.j2 = j2;
	}

	public String getJ3() {
		return j3;
	}

	public void setJ3(String j3) {
		this.j3 = j3;
	}

	public String getJ4() {
		return j4;
	}

	public void setJ4(String j4) {
		this.j4 = j4;
	}

	public String getJ6() {
		return j6;
	}

	public void setJ6(String j6) {
		this.j6 = j6;
	}

	public String getJ7() {
		return j7;
	}

	public void setJ7(String j7) {
		this.j7 = j7;
	}

	public String getJ8() {
		return j8;
	}

	public void setJ8(String j8) {
		this.j8 = j8;
	}

	public String getJ9() {
		return j9;
	}

	public void setJ9(String j9) {
		this.j9 = j9;
	}

	public String getK0() {
		return k0;
	}

	public void setK0(String k0) {
		this.k0 = k0;
	}

	public String getK1() {
		return k1;
	}

	public void setK1(String k1) {
		this.k1 = k1;
	}

	public String getK3() {
		return k3;
	}

	public void setK3(String k3) {
		this.k3 = k3;
	}

	public String getK4() {
		return k4;
	}

	public void setK4(String k4) {
		this.k4 = k4;
	}

	public String getK5() {
		return k5;
	}

	public void setK5(String k5) {
		this.k5 = k5;
	}

	public String getK6() {
		return k6;
	}

	public void setK6(String k6) {
		this.k6 = k6;
	}

	public List<AssetXaDto> getK7() {
		return k7;
	}

	public void setK7(List<AssetXaDto> k7) {
		this.k7 = k7;
	}

	public List<SubAssetDto> getSubAssetDtoList() {
		return subAssetDtoList;
	}

	public void setSubAssetDtoList(List<SubAssetDto> subAssetDtoList) {
		this.subAssetDtoList = subAssetDtoList;
	}

	public List<AssetPromDto> getAssetPromDtoList() {
		return assetPromDtoList;
	}

	public void setAssetPromDtoList(List<AssetPromDto> assetPromDtoList) {
		this.assetPromDtoList = assetPromDtoList;
	}

	public Double getK8() {
		return k8;
	}

	public void setK8(Double k8) {
		this.k8 = k8;
	}

	public String getK9() {
		return k9;
	}

	public void setK9(String k9) {
		this.k9 = k9;
	}

	public String getM0() {
		return m0;
	}

	public void setM0(String m0) {
		this.m0 = m0;
	}

	public String getM1() {
		return m1;
	}

	public void setM1(String m1) {
		this.m1 = m1;
	}

	public String getM2() {
		return m2;
	}

	public void setM2(String m2) {
		this.m2 = m2;
	}

	public String getM3() {
		return m3;
	}

	public void setM3(String m3) {
		this.m3 = m3;
	}

	public String getM4() {
		return m4;
	}

	public void setM4(String m4) {
		this.m4 = m4;
	}

	public String getM5() {
		return m5;
	}

	public void setM5(String m5) {
		this.m5 = m5;
	}

	public String getM6() {
		return m6;
	}

	public void setM6(String m6) {
		this.m6 = m6;
	}

	public String getM7() {
		return m7;
	}

	public void setM7(String m7) {
		this.m7 = m7;
	}

	public String getM8() {
		return m8;
	}

	public void setM8(String m8) {
		this.m8 = m8;
	}

	public String getM9() {
		return m9;
	}

	public void setM9(String m9) {
		this.m9 = m9;
	}

	public String getN1() {
		return n1;
	}

	public void setN1(String n1) {
		this.n1 = n1;
	}

	public String getN2() {
		return n2;
	}

	public void setN2(String n2) {
		this.n2 = n2;
	}

	public String getN3() {
		return n3;
	}

	public void setN3(String n3) {
		this.n3 = n3;
	}

	public String getD5() {
		return d5;
	}

	public void setD5(String d5) {
		this.d5 = d5;
	}

	public String getN4() {
		return n4;
	}

	public void setN4(String n4) {
		this.n4 = n4;
	}

	public String getN5() {
		return n5;
	}

	public void setN5(String n5) {
		this.n5 = n5;
	}

	public String getN6() {
		return n6;
	}

	public void setN6(String n6) {
		this.n6 = n6;
	}

	public String getN7() {
		return n7;
	}

	public void setN7(String n7) {
		this.n7 = n7;
	}

	public String getN8() {
		return n8;
	}

	public void setN8(String n8) {
		this.n8 = n8;
	}

	public String getN9() {
		return n9;
	}

	public void setN9(String n9) {
		this.n9 = n9;
	}

	public String getO1() {
		return o1;
	}

	public void setO1(String o1) {
		this.o1 = o1;
	}

	public String getO2() {
		return o2;
	}

	public void setO2(String o2) {
		this.o2 = o2;
	}

	public String getO3() {
		return o3;
	}

	public void setO3(String o3) {
		this.o3 = o3;
	}

	public String getO4() {
		return o4;
	}

	public void setO4(String o4) {
		this.o4 = o4;
	}
}