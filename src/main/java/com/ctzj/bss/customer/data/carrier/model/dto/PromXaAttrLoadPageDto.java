package com.ctzj.bss.customer.data.carrier.model.dto;

import com.ctzj.bss.customer.data.carrier.model.annotation.CacheIgnore;

public class PromXaAttrLoadPageDto extends AssetPromXaAttrDto {
	private static final long serialVersionUID = 1L;

	@CacheIgnore
	private Long loadNum;

	public Long getLoadNum() {
		return loadNum;
	}

	public void setLoadNum(Long loadNum) {
		this.loadNum = loadNum;
	}

}
