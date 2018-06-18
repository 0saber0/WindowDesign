package com.milanuo.window.pojo;

import java.util.List;

/**
 * ZC88分页结果类
 * 
 * @author 51988
 *
 */
public class BasePageResult {
	private Long totalCount;// 查询结果的总条数
	private Double areas;// 查询的所有结果的面积
	private Double glassAreas;// 查询所有结果玻璃的面积
	private List<BaseType> listA1;// 每一页的结果
	private List<BaseType> listA2;// 每一页的结果
	private List<BaseType> listA3;// 每一页的结果
	private List<BaseType> listA4;// 每一页的结果
	private List<BaseType> listA5;// 每一页的结果

	public BasePageResult(Long totalCount, Double areas, Double glassAreas, List<BaseType> listA1,
			List<BaseType> listA2, List<BaseType> listA3, List<BaseType> listA4, List<BaseType> listA5) {
		super();
		this.totalCount = totalCount;
		this.areas = areas;
		this.glassAreas = glassAreas;
		this.listA1 = listA1;
		this.listA2 = listA2;
		this.listA3 = listA3;
		this.listA4 = listA4;
		this.listA5 = listA5;
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

	public Double getGlassAreas() {
		return glassAreas;
	}

	public void setGlassAreas(Double glassAreas) {
		this.glassAreas = glassAreas;
	}

	public List<BaseType> getListA1() {
		return listA1;
	}

	public void setListA1(List<BaseType> listA1) {
		this.listA1 = listA1;
	}

	public List<BaseType> getListA2() {
		return listA2;
	}

	public void setListA2(List<BaseType> listA2) {
		this.listA2 = listA2;
	}

	public List<BaseType> getListA3() {
		return listA3;
	}

	public void setListA3(List<BaseType> listA3) {
		this.listA3 = listA3;
	}

	public List<BaseType> getListA4() {
		return listA4;
	}

	public void setListA4(List<BaseType> listA4) {
		this.listA4 = listA4;
	}

	public List<BaseType> getListA5() {
		return listA5;
	}

	public void setListA5(List<BaseType> listA5) {
		this.listA5 = listA5;
	}

}
