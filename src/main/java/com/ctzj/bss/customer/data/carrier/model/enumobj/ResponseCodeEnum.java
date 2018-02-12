package com.ctzj.bss.customer.data.carrier.model.enumobj;

public enum ResponseCodeEnum {

	SUCCESS(0),DATA_NOT_FOUND(1000),ERROR_EXCEPTION(2000),ERROR_PARAM(2001),SYSTEM_EXCEPTION(2002),NON_SUPPORT(2003);
	
	private int code;
	
	private ResponseCodeEnum(int code){
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
}
