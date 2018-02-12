package com.ctzj.bss.customer.data.carrier.model.dto;

import com.ctzj.bss.customer.data.carrier.model.annotation.CacheIgnore;

/**
 * Author: Huoh
 * Created on 2017/10/25 09:51.
 */
public class ProdIntLoadPageDto extends ProdIntDto {
    private static final long serialVersionUID = 1L;

    @CacheIgnore
    private String rowId;

    @CacheIgnore
    private long loadNum;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public long getLoadNum() {
        return loadNum;
    }

    public void setLoadNum(long loadNum) {
        this.loadNum = loadNum;
    }
}
