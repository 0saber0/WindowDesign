package com.milanuo.window.search;

import java.util.Date;

/**
 * 封装数据总览页的查询条件
 * 
 * @author 51988
 *
 */
public class SearchOption {

	private String materialType;
	private String windowType;
	private Date minDate;
	private Date maxDate;

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getWindowType() {
		return windowType;
	}

	public void setWindowType(String windowType) {
		this.windowType = windowType;
	}

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

}
