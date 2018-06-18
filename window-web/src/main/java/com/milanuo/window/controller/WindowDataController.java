package com.milanuo.window.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milanuo.window.pojo.PageResult;
import com.milanuo.window.pojo.ReturnResult;
import com.milanuo.window.pojo.Windowdata;
import com.milanuo.window.service.impl.WindowDataServiceImpl;

/**
 * 窗户数据控制层
 * 
 * @author 51988
 *
 */
@RestController
@RequestMapping("/window")
public class WindowDataController {
	
	@Autowired
	private WindowDataServiceImpl service;
	
	@RequestMapping("/search")
	public PageResult search(@RequestBody Windowdata windowdata, int pageNum, int pageSize) {
		
		return service.findPage(windowdata, pageNum, pageSize);
	}
	
	@RequestMapping("/getOne")
	public Windowdata getOne(Long id) {
		
		return service.getOne(id);
	}
	
	@RequestMapping("/findAll")
	public List<Windowdata> findAll() {
		
		return service.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int pageNum,int pageSize) {
		
		return service.findPage(pageNum, pageSize);
	}
	
	@RequestMapping("/add")
	public ReturnResult add(@RequestBody Windowdata windowdata) {
		try {
			service.add(windowdata);
			return new ReturnResult(true, "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnResult(false, "添加失败");
		}
	}
	
	@RequestMapping("/update")
	public ReturnResult update(@RequestBody Windowdata windowdata) {
		try {
			service.update(windowdata);
			return new ReturnResult(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnResult(false, "修改失败");
		}
	}
	
	@RequestMapping("/delete")
	public ReturnResult delete(Long[] ids) {
		try {
			service.delete(ids);
			return new ReturnResult(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnResult(false, "删除失败");
		}
	}
	
}
