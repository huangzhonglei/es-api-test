package com.ctzj.bss.customer.data.carrier.model.dto;

import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: Huoh
 * Created on 2017/10/12 11:08.
 */
public class CacheAccountDto implements Serializable {
    private static final long serialVersionUID = -8016643439793486878L;

    @FieldMap(name = "id")
    private String a01;
    @FieldMap(name = "accountNumber")
    private String a02;
    @FieldMap(name = "accontGrade")
    private String a03;
    @FieldMap(name = "oldAccontGrade")
    private String a04;
    @FieldMap(name = "accountManager")
    private String a05;//现网逻辑 nvl(CX_SALE_EXT.NAME,CX_ORG_EXT_X.ATTRIB12)
    @FieldMap(name = "accountManagerPhone")
    private String a06;//现网逻辑 nvl(CX_SALE_EXT.MAIN_PH_NUM,CX_ORG_EXT_X.ATTRIB13)
    @FieldMap(name = "c3Name")
    private String a07;
    @FieldMap(name = "c4Name")
    private String a08;
    @FieldMap(name = {"idNumber","accountIdNumber"})
    private String a09;
    @FieldMap(name = {"accountIdType","idType"})
    private String a10;
    @FieldMap(name = "intStatus")
    private String a11;
    @FieldMap(name = "operatorAddress")
    private String a12;
    @FieldMap(name = "operatorCredentialNum")
    private String a13;
    @FieldMap(name = "operatorCredentialType")
    private String a14;
    @FieldMap(name = "operatorName")
    private String a15;
    @FieldMap(name = "starLevel")
    private String a16;
    @FieldMap(name = "disableDataCleansing")
    private String a17;
    @FieldMap(name = "facilityFlag")
    private String a18;
    @FieldMap(name = "mainPhoneNumber")
    private String a19;
    @FieldMap(name = "accountStatus")
    private String a20;
    @FieldMap(name = {"accountName","name"})
    private String a21;
    @FieldMap(name = "ykLevel")
    private String a22;
    @FieldMap(name = "accountTypeCd")
    private String a23;

    /*@FieldMap(name = "postalCode")
    @CacheIgnore
    private String a24;
    @FieldMap(name = "streetAddress")
    private String a25;
    @FieldMap(name = "county")
    private String a26;*/
    @FieldMap(name = "accountType")
    private String a27;
    /*@FieldMap(name = "contactName")
    private String a28;
    @FieldMap(name = "blacklistDesc")
    private String a29;*/
    @FieldMap(name = "archiveType")
    private String a30;
    @FieldMap(name = "hqAccountId")
    private String a31;
    @FieldMap(name = "accBrand")
    private String a32;
    @FieldMap(name = "customerSetType")
    private String a33;
    @FieldMap(name = "creditLevel")
    private String a34;
    @FieldMap(name = "industyCode")
    private String a35;
    @FieldMap(name = "createdDate")
    private Date a36;
    @FieldMap(name = "createdBy")
    private String a37;
    @FieldMap(name = "certOrg")
    private String a38;
    @FieldMap(name = "finAcctCurentBranch")
    private String a39;
    @FieldMap(name = "emailAddress")
    private String a40;
    @FieldMap(name = "otherContactPhone")
    private String a41;
    /*@FieldMap(name = {"postCode", "postalCode"})
    private String a42;*/
    @FieldMap(name = "faxNum")
    private String a43;
    @FieldMap(name = "ticker")
    private String a44;
    @FieldMap(name = "marketClass")
    private String a45;

    @FieldMap(name = "groupCode")
    private String a47;
    @FieldMap(name = "provinceCode")
    private String a48;
    @FieldMap(name = "isCountyOffice")
    private String a49;
    @FieldMap(name = "accStaticType")
    private String a50;
    @FieldMap(name = "familyCustmer")
    private String a51;
    @FieldMap(name = "familyCustmerVal")
    private String a52;
    @FieldMap(name = "linBusiness")
    private String a53;
    @FieldMap(name = "rgbAcc")
    private String a54;
    @FieldMap(name = "gender")
    private String a55;
    @FieldMap(name = "vpdnType")
    private String a56;
    @FieldMap(name = {"finAcctNatureofBusiness", "nationalBusiness"})
    private String a46;
    /*@FieldMap(name = "xRgbListType")
    private String a58;*/
    @FieldMap(name = "accountAddressId")
    private String a59;
    @FieldMap(name = "imortantFlg")
    private String a60;
    /*@FieldMap(name = "contactId")
    private String a61;*/
    @FieldMap(name = "recordNum")
    private String a62;
    @FieldMap(name = "custManager")
    private String a63;
    @FieldMap(name = "custManagerPhone")
    private String a64;//现网逻辑nvl(CX_ORG_EXT_X.ATTRIB13,CX_SALE_EXT.MAIN_PH_NUM)
    /*@FieldMap(name = "mainContactId")
    private String a65;
    @FieldMap(name = "mainContactName")
    private String a66;
    @FieldMap(name = "mainContactIdType")
    private String a67;
    @FieldMap(name = "mainContactIdNumber")
    private String a68;
    @FieldMap(name = "mainContactPhone")
    private String a69;
    @FieldMap(name = "mainContactHomePhone")
    private String a70;*/
    @FieldMap(name = "assurerAccountNum")
    private String a71;
    @FieldMap(name = "idAddress")
    private String a72;
    @FieldMap(name = "LatestSrId")
    private String a73;
    @FieldMap(name = "userIdentity")
    private String a74;
    @FieldMap(name = "accountSubType")
    private String a75;
    @FieldMap(name = "dontCall")
    private String a76;
    @FieldMap(name = "dontShare")
    private String a77;
    @FieldMap(name = "clientFlag")
    private String a78;
    @FieldMap(name = "printNum")
    private String a79;
    @FieldMap(name = "manageAttr")
    private String a80;
    @FieldMap(name = "salesOrganization")
    private String a81;
    @FieldMap(name = "busAccFlag")
    private String a82;
    @FieldMap(name = "busNavType")
    private String a83;


    public String getA01() {
        return a01;
    }

    public void setA01(String a01) {
        this.a01 = a01;
    }

    public String getA02() {
        return a02;
    }

    public void setA02(String a02) {
        this.a02 = a02;
    }

    public String getA03() {
        return a03;
    }

    public void setA03(String a03) {
        this.a03 = a03;
    }

    public String getA04() {
        return a04;
    }

    public void setA04(String a04) {
        this.a04 = a04;
    }

    public String getA05() {
        return a05;
    }

    public void setA05(String a05) {
        this.a05 = a05;
    }

    public String getA06() {
        return a06;
    }

    public void setA06(String a06) {
        this.a06 = a06;
    }

    public String getA07() {
        return a07;
    }

    public void setA07(String a07) {
        this.a07 = a07;
    }

    public String getA08() {
        return a08;
    }

    public void setA08(String a08) {
        this.a08 = a08;
    }

    public String getA09() {
        return a09;
    }

    public void setA09(String a09) {
        this.a09 = a09;
    }

    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }

    public String getA13() {
        return a13;
    }

    public void setA13(String a13) {
        this.a13 = a13;
    }

    public String getA14() {
        return a14;
    }

    public void setA14(String a14) {
        this.a14 = a14;
    }

    public String getA15() {
        return a15;
    }

    public void setA15(String a15) {
        this.a15 = a15;
    }

    public String getA16() {
        return a16;
    }

    public void setA16(String a16) {
        this.a16 = a16;
    }

    public String getA17() {
        return a17;
    }

    public void setA17(String a17) {
        this.a17 = a17;
    }

    public String getA18() {
        return a18;
    }

    public void setA18(String a18) {
        this.a18 = a18;
    }

    public String getA19() {
        return a19;
    }

    public void setA19(String a19) {
        this.a19 = a19;
    }

    public String getA20() {
        return a20;
    }

    public void setA20(String a20) {
        this.a20 = a20;
    }

    public String getA21() {
        return a21;
    }

    public void setA21(String a21) {
        this.a21 = a21;
    }

    public String getA22() {
        return a22;
    }

    public void setA22(String a22) {
        this.a22 = a22;
    }

    public String getA23() {
        return a23;
    }

    public void setA23(String a23) {
        this.a23 = a23;
    }

    public String getA27() {
        return a27;
    }

    public void setA27(String a27) {
        this.a27 = a27;
    }

    public String getA30() {
        return a30;
    }

    public void setA30(String a30) {
        this.a30 = a30;
    }

    public String getA31() {
        return a31;
    }

    public void setA31(String a31) {
        this.a31 = a31;
    }

    public String getA32() {
        return a32;
    }

    public void setA32(String a32) {
        this.a32 = a32;
    }

    public String getA33() {
        return a33;
    }

    public void setA33(String a33) {
        this.a33 = a33;
    }

    public String getA34() {
        return a34;
    }

    public void setA34(String a34) {
        this.a34 = a34;
    }

    public String getA35() {
        return a35;
    }

    public void setA35(String a35) {
        this.a35 = a35;
    }

    public Date getA36() {
        return a36;
    }

    public void setA36(Date a36) {
        this.a36 = a36;
    }

    public String getA37() {
        return a37;
    }

    public void setA37(String a37) {
        this.a37 = a37;
    }

    public String getA38() {
        return a38;
    }

    public void setA38(String a38) {
        this.a38 = a38;
    }

    public String getA39() {
        return a39;
    }

    public void setA39(String a39) {
        this.a39 = a39;
    }

    public String getA40() {
        return a40;
    }

    public void setA40(String a40) {
        this.a40 = a40;
    }

    public String getA41() {
        return a41;
    }

    public void setA41(String a41) {
        this.a41 = a41;
    }

    public String getA43() {
        return a43;
    }

    public void setA43(String a43) {
        this.a43 = a43;
    }

    public String getA44() {
        return a44;
    }

    public void setA44(String a44) {
        this.a44 = a44;
    }

    public String getA45() {
        return a45;
    }

    public void setA45(String a45) {
        this.a45 = a45;
    }

    public String getA46() {
        return a46;
    }

    public void setA46(String a46) {
        this.a46 = a46;
    }

    public String getA47() {
        return a47;
    }

    public void setA47(String a47) {
        this.a47 = a47;
    }

    public String getA48() {
        return a48;
    }

    public void setA48(String a48) {
        this.a48 = a48;
    }

    public String getA49() {
        return a49;
    }

    public void setA49(String a49) {
        this.a49 = a49;
    }

    public String getA50() {
        return a50;
    }

    public void setA50(String a50) {
        this.a50 = a50;
    }

    public String getA51() {
        return a51;
    }

    public void setA51(String a51) {
        this.a51 = a51;
    }

    public String getA52() {
        return a52;
    }

    public void setA52(String a52) {
        this.a52 = a52;
    }

    public String getA53() {
        return a53;
    }

    public void setA53(String a53) {
        this.a53 = a53;
    }

    public String getA54() {
        return a54;
    }

    public void setA54(String a54) {
        this.a54 = a54;
    }

    public String getA55() {
        return a55;
    }

    public void setA55(String a55) {
        this.a55 = a55;
    }

    public String getA56() {
        return a56;
    }

    public void setA56(String a56) {
        this.a56 = a56;
    }

    public String getA59() {
        return a59;
    }

    public void setA59(String a59) {
        this.a59 = a59;
    }

    public String getA60() {
        return a60;
    }

    public void setA60(String a60) {
        this.a60 = a60;
    }

    public String getA62() {
        return a62;
    }

    public void setA62(String a62) {
        this.a62 = a62;
    }

    public String getA63() {
        return a63;
    }

    public void setA63(String a63) {
        this.a63 = a63;
    }

    public String getA64() {
        return a64;
    }

    public void setA64(String a64) {
        this.a64 = a64;
    }

    public String getA71() {
        return a71;
    }

    public void setA71(String a71) {
        this.a71 = a71;
    }

    public String getA72() {
        return a72;
    }

    public void setA72(String a72) {
        this.a72 = a72;
    }

    public String getA73() {
        return a73;
    }

    public void setA73(String a73) {
        this.a73 = a73;
    }

    public String getA74() {
        return a74;
    }

    public void setA74(String a74) {
        this.a74 = a74;
    }

    public String getA75() {
        return a75;
    }

    public void setA75(String a75) {
        this.a75 = a75;
    }

    public String getA76() {
        return a76;
    }

    public void setA76(String a76) {
        this.a76 = a76;
    }

    public String getA77() {
        return a77;
    }

    public void setA77(String a77) {
        this.a77 = a77;
    }

    public String getA78() {
        return a78;
    }

    public void setA78(String a78) {
        this.a78 = a78;
    }

    public String getA79() {
        return a79;
    }

    public void setA79(String a79) {
        this.a79 = a79;
    }

    public String getA80() {
        return a80;
    }

    public void setA80(String a80) {
        this.a80 = a80;
    }

    public String getA81() {
        return a81;
    }

    public void setA81(String a81) {
        this.a81 = a81;
    }

    public String getA82() {
        return a82;
    }

    public void setA82(String a82) {
        this.a82 = a82;
    }

    public String getA83() {
        return a83;
    }

    public void setA83(String a83) {
        this.a83 = a83;
    }
}
