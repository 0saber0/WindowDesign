package com.milanuo.window.service;

import com.milanuo.window.search.SearchOption;
import com.milanuo.window.search.SearchPageResult;

/**
 * 服务接口
 * 
 * @author 51988
 *
 */
public interface OverviewService {
	/**
	 * 条件+分页查询
	 * @param brand	查询条件
	 * @param pageNum	分页后显示第几页
	 * @param pageSize	每页多少条数据
	 * @return
	 */
	public SearchPageResult findPage(SearchOption searchOption,int pageNum,int pageSize); 
	
}
