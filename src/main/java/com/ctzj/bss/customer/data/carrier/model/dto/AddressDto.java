package com.ctzj.bss.customer.data.carrier.model.dto;

import java.io.Serializable;

import com.ctzj.bss.customer.data.carrier.model.annotation.CacheIgnore;
import com.ctzj.bss.customer.data.carrier.model.annotation.FieldMap;

/**
 * @Description: 地址实体
 * @author pengzz
 * @date 2017年10月26日
 *
 */
public class AddressDto implements Serializable {

	private static final long serialVersionUID = -3494959499284391866L;
	/**
	 * 主键
	 */
	@CacheIgnore
	private String rowId;
	/**
	 * 装机地址
	 */
	@FieldMap(name = "serviceAddress")
	private String b;

	// @CacheIgnore
	// private String c3Name;

	@CacheIgnore
	private Long loadNum;/* 序号 */
	@CacheIgnore
	private String assetId;/* 主资产Id */

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public Long getLoadNum() {
		return loadNum;
	}

	public void setLoadNum(Long loadNum) {
		this.loadNum = loadNum;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
}
