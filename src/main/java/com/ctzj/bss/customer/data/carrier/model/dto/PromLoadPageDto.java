package com.ctzj.bss.customer.data.carrier.model.dto;

import com.ctzj.bss.customer.data.carrier.model.annotation.CacheIgnore;

public class PromLoadPageDto extends PromDto{
	private static final long serialVersionUID = 1L;
	@CacheIgnore
	private String rowId;
	@CacheIgnore
	private Long loadNum;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public Long getLoadNum() {
		return loadNum;
	}

	public void setLoadNum(Long loadNum) {
		this.loadNum = loadNum;
	}
	
}
