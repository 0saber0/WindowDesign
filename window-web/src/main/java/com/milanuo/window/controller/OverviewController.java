package com.milanuo.window.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milanuo.window.search.SearchOption;
import com.milanuo.window.search.SearchPageResult;
import com.milanuo.window.service.impl.OverviewServiceImpl;

/**
 * 窗户数据控制层
 * 
 * @author 51988
 *
 */
@RestController
@RequestMapping("/overview")
public class OverviewController {
	
	@Autowired
	private OverviewServiceImpl service;
	
	@RequestMapping("/search")
	public SearchPageResult search(@RequestBody SearchOption searchOption, int pageNum, int pageSize) {
		
		return service.findPage(searchOption, pageNum, pageSize);
	}
	
}
