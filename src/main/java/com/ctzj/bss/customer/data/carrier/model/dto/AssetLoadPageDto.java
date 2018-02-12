package com.ctzj.bss.customer.data.carrier.model.dto;

import java.util.List;

import com.ctzj.bss.customer.data.carrier.model.annotation.CacheIgnore;

public class AssetLoadPageDto extends AssetDto {

	@CacheIgnore
	private static final long serialVersionUID = 1L;

	/**
	 * 分页表的序列
	 */
	@CacheIgnore
	private Long loadNum;

	/**
	 * 是否是主资产
	 */
	@CacheIgnore
	private Boolean isRootAsset;

	/**
	 * 销售品头
	 */
	@CacheIgnore
	private AssetDto promAssetDto;

	/**
	 * 销售品头
	 */
	@CacheIgnore
	private AssetPromDto assetPromDto;

	/**
	 * 资产是否活动
	 */
	@CacheIgnore
	private Boolean isActive;

	/**
	 * 同销售品下的主资产列表
	 */
	@CacheIgnore
	private List<String> integIdList;

	@CacheIgnore
	private CacheAccountDto accountDto;

	@CacheIgnore
	private CacheBillAccountDto billAccountDto;

	@CacheIgnore
	private AddressDto addressDto;

	public AssetLoadPageDto() {
		isRootAsset = true;
		isActive = true;
	}

	public Long getLoadNum() {
		return loadNum;
	}

	public void setLoadNum(Long loadNum) {
		this.loadNum = loadNum;
	}

	public AssetDto getPromAssetDto() {
		return promAssetDto;
	}

	public void setPromAssetDto(AssetDto promAssetDto) {
		this.promAssetDto = promAssetDto;
	}

	public Boolean getIsRootAsset() {
		return isRootAsset;
	}

	public void setIsRootAsset(Boolean isRootAsset) {
		this.isRootAsset = isRootAsset;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<String> getIntegIdList() {
		return integIdList;
	}

	public void setIntegIdList(List<String> integIdList) {
		this.integIdList = integIdList;
	}

	public CacheAccountDto getAccountDto() {
		return accountDto;
	}

	public void setAccountDto(CacheAccountDto accountDto) {
		this.accountDto = accountDto;
	}

	public CacheBillAccountDto getBillAccountDto() {
		return billAccountDto;
	}

	public void setBillAccountDto(CacheBillAccountDto billAccountDto) {
		this.billAccountDto = billAccountDto;
	}

	public AssetPromDto getAssetPromDto() {
		return assetPromDto;
	}

	public void setAssetPromDto(AssetPromDto assetPromDto) {
		this.assetPromDto = assetPromDto;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}
}
