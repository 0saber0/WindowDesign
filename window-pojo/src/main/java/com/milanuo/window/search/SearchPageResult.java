package com.milanuo.window.search;

import java.util.List;

import com.milanuo.window.pojo.Windowdata;

/**
 * 数据浏览的返回结果集
 * 
 * @author 51988
 *
 */
public class SearchPageResult {

	private Long totalCount;// 查询结果的总条数
	private Double areas;// 查询的所有结果的面积
	private List<Windowdata> listAll;// 每一页的结果

	public SearchPageResult(Long totalCount, Double areas, List<Windowdata> listAll) {
		super();
		this.totalCount = totalCount;
		this.areas = areas;
		this.listAll = listAll;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Double getAreas() {
		return areas;
	}

	public void setAreas(Double areas) {
		this.areas = areas;
	}

	public List<Windowdata> getListAll() {
		return listAll;
	}

	public void setListAll(List<Windowdata> listAll) {
		this.listAll = listAll;
	}

}
