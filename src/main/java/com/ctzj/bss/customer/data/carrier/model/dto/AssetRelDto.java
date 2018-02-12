package com.ctzj.bss.customer.data.carrier.model.dto;

public class AssetRelDto {
	private String rowId;/* 资产id */
	private String integrationNum;/* 业务号码 */
	private String circuitNumber;/* 专线编号 */
	private String dependentCircuitNumber;/* 电路编号 */
	private String serviceId;/* 电话号码 */
	private String networkAccnt;/* 宽带账号 */
	private String snNo;/* 管道编号 */
	private String status;/* 资产状态 */
	private String accId;/* 客户id */
	private String accNumber;/* 客户编码 */
	private String idNumber;/*证件号码*/
	private String c3Name;/* 地市 */
	private long loadNum;/* 序号 */

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getIntegrationNum() {
		return integrationNum;
	}

	public void setIntegrationNum(String integrationNum) {
		this.integrationNum = integrationNum;
	}

	public String getCircuitNumber() {
		return circuitNumber;
	}

	public void setCircuitNumber(String circuitNumber) {
		this.circuitNumber = circuitNumber;
	}

	public String getDependentCircuitNumber() {
		return dependentCircuitNumber;
	}

	public void setDependentCircuitNumber(String dependentCircuitNumber) {
		this.dependentCircuitNumber = dependentCircuitNumber;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getNetworkAccnt() {
		return networkAccnt;
	}

	public void setNetworkAccnt(String networkAccnt) {
		this.networkAccnt = networkAccnt;
	}

	public String getSnNo() {
		return snNo;
	}

	public void setSnNo(String snNo) {
		this.snNo = snNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getC3Name() {
		return c3Name;
	}

	public void setC3Name(String c3Name) {
		this.c3Name = c3Name;
	}

	public long getLoadNum() {
		return loadNum;
	}

	public void setLoadNum(long loadNum) {
		this.loadNum = loadNum;
	}
}
