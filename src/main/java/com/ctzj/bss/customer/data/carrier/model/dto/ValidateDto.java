package com.ctzj.bss.customer.data.carrier.model.dto;

import java.util.Date;

public class ValidateDto {

	public ValidateDto() {
		this.checkFlag = false;
	}

	/**
	 * 区域
	 */
	private String c3Name;

	/**
	 * 资产状态
	 */
	private String status;

	/**
	 * 区域是否开通
	 */
	private boolean checkFlag;

	/**
	 * 父资产id
	 */
	private String parRowId;
	/**
	 * 最后修改时间
	 */
	private Date lastUpdt;

	public String getC3Name() {
		return c3Name;
	}

	public void setC3Name(String c3Name) {
		this.c3Name = c3Name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(boolean checkFlag) {
		this.checkFlag = checkFlag;
	}

	public String getParRowId() {
		return parRowId;
	}

	public void setParRowId(String parRowId) {
		this.parRowId = parRowId;
	}

	public Date getLastUpdt() {
		return lastUpdt;
	}

	public void setLastUpdt(Date lastUpdt) {
		this.lastUpdt = lastUpdt;
	}

}
