package com.sogou.bizdev.muse.adcore.app.dto;

import java.io.Serializable;
import java.util.Date;

public class AdcoreDto implements Serializable{

	private static final long serialVersionUID = 3778804643223425690L;
	private Long cpcId;
	private Long accountId;
	private String key;
	private String url;
	private Date createDate;
	private Date chgDate;
	private Integer maxPrice;
	
	public Long getId() {
		return cpcId;
	}
	public void setId(Long cpcId) {
		this.cpcId = cpcId;
	}
	public Long getCpcId() {
		return cpcId;
	}
	public void setCpcId(Long cpcId) {
		this.cpcId = cpcId;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getChgDate() {
		return chgDate;
	}
	public void setChgDate(Date chgDate) {
		this.chgDate = chgDate;
	}
	public Integer getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Adcore [cpcId=" + cpcId + ", accountId=" + accountId + ", key="
				+ key + ", url=" + url + ", createDate=" + createDate
				+ ", chgDate=" + chgDate + ", maxPrice=" + maxPrice + "]";
	}
}
