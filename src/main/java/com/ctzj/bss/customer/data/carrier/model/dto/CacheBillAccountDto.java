package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;
import java.util.Date;

import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;

/**
 * Author: Huoh
 * Created on 2017/10/12 20:06.
 */
public class CacheBillAccountDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @FieldMap(name = "id")
    private String b01;/*帐户ROW_ID*/

    @FieldMap(name = "accountId")
    private String b02;/*客户ID*/

    @FieldMap(name = {"billAccountNumber", "bankCode","billAccountNum"})
    private String b03;/*帐户编码*/

    @FieldMap(name = {"billStatus","intStatus"})
    private String b04;/*帐户集成状态*/
    @FieldMap(name = {"billAccountName","name"})
    private String b05;/*合同号名称*/

    /*@FieldMap(name = "bankAccountNumber")
    private String b06;*//*银行帐号*//*
    @FieldMap(name = "bankAgmtId")
    private String b07;*//*银行协议号*//*
    @FieldMap(name = "county")
    private String b08;*//*县/区*//*
    @FieldMap(name = "postal")
    private String b09;*//*邮政编码*//*
    @FieldMap(name = "bankAccountName")
    private String b10;*//*开户名称*/
    /*@FieldMap(name = "billSource")
    private String b12;*//*出帐日期*//*
    @FieldMap(name = "paymentMethod")
    private String b13;*//*付款方法*//*
    @FieldMap(name = "bankName")
    private String b14;*//*银行名称*//*
    @FieldMap(name = "billFrequency")
    private String b15;*//*缴费周期*//*
    @FieldMap(name = "billType")
    private String b16;*//*帐单类型*//*
    @FieldMap(name = "city")
    private String b17;*//*城市*/

    @FieldMap(name = "bankBranchCode")
    private String b18;/*分行代码*/

    /*@FieldMap(name = "mediaType")
    private String b19;*//*帐单方式*//*
    @FieldMap(name = "streetAddress")
    private String b20;*//*邮寄地址*//*
    @FieldMap(name = "bankBranch")
    private String b21;*//*分行/分理处名称*/

    @FieldMap(name = "statusDate")
    private Date b22;

    @FieldMap(name = "hqAccountId")
    private String b23;/*外部账号ID*/
    @FieldMap(name = "c3Name")
    private String b24;/*账户的C3信息*/
    @FieldMap(name = "c4Name")
    private String b25;/*账户的C4信息*/

    /*@FieldMap(name = "emailC3Name")
    private String b26;*//*邮寄地址C3*//*
    @FieldMap(name = "emailC4Name")
    private String b27;*//*邮寄地址C4*//*
    @FieldMap(name = "emailAddr")
    private String b28;*//*邮寄地址*/

    @FieldMap(name = "billOweStatus")
    private String b29;//账户欠费状态

    /*@FieldMap(name = "interestatInvoiceFlag")
    private String b30;//送缴标志*/

    @FieldMap(name = "created")
    private Date b31;
    @FieldMap(name = "createdBy")
    private String b32;/*合同创建工号Id*/
    @FieldMap(name = "printNumberIntegId")
    private String b34;/*打印号码资产集成ID*/

    /*@FieldMap(name = "payStation")
    private String b33;*//*付费支局
    @FieldMap(name = "addrName")
    private String b35;*//*账户地址*//*
    @FieldMap(name = "hqPayPointType")
    private String b36;*//*集团一点收费账户类型*//*
    @FieldMap(name = "serviceCardStatus")
    private String b37;*//*账户服务卡状态*//*
    @FieldMap(name = "amount")
    private String b38;
    @FieldMap(name = "billVendorId")
    private String b39;
    @FieldMap(name = "lowLimit")
    private String b40;
    @FieldMap(name = "totalLimit")
    private String b41;
    @FieldMap(name = "scMPhoneNumber")
    private String b42;*/

    @FieldMap(name = "accountType")
    private String b43;


    public String getB01() {
        return b01;
    }

    public void setB01(String b01) {
        this.b01 = b01;
    }

    public String getB02() {
        return b02;
    }

    public void setB02(String b02) {
        this.b02 = b02;
    }

    public String getB03() {
        return b03;
    }

    public void setB03(String b03) {
        this.b03 = b03;
    }

    public String getB04() {
        return b04;
    }

    public void setB04(String b04) {
        this.b04 = b04;
    }

    public String getB05() {
        return b05;
    }

    public void setB05(String b05) {
        this.b05 = b05;
    }

    public String getB18() {
        return b18;
    }

    public void setB18(String b18) {
        this.b18 = b18;
    }

    public Date getB22() {
        return b22;
    }

    public void setB22(Date b22) {
        this.b22 = b22;
    }

    public String getB23() {
        return b23;
    }

    public void setB23(String b23) {
        this.b23 = b23;
    }

    public String getB24() {
        return b24;
    }

    public void setB24(String b24) {
        this.b24 = b24;
    }

    public String getB25() {
        return b25;
    }

    public void setB25(String b25) {
        this.b25 = b25;
    }

    public String getB29() {
        return b29;
    }

    public void setB29(String b29) {
        this.b29 = b29;
    }

    public Date getB31() {
        return b31;
    }

    public void setB31(Date b31) {
        this.b31 = b31;
    }

    public String getB32() {
        return b32;
    }

    public void setB32(String b32) {
        this.b32 = b32;
    }

    public String getB34() {
        return b34;
    }

    public void setB34(String b34) {
        this.b34 = b34;
    }

    public String getB43() {
        return b43;
    }

    public void setB43(String b43) {
        this.b43 = b43;
    }
}
