package com.milanuo.window.pojo;

import java.util.List;

/**
 * 分页结果类
 * 
 * @author 51988
 *
 */
public class PageResult {
	private Long totalCount;// 查询结果的总条数
	@SuppressWarnings("rawtypes")
	private List result;// 每一页的结果

	@SuppressWarnings("rawtypes")
	public PageResult(Long totalCount, List result) {
		super();
		this.totalCount = totalCount;
		this.result = result;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	@SuppressWarnings("rawtypes")
	public List getResult() {
		return result;
	}

	@SuppressWarnings("rawtypes")
	public void setResult(List result) {
		this.result = result;
	}

}
