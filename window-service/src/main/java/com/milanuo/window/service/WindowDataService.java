package com.milanuo.window.service;

import java.util.List;

import com.milanuo.window.pojo.PageResult;
import com.milanuo.window.pojo.Windowdata;

/**
 * 服务接口
 * 
 * @author 51988
 *
 */
public interface WindowDataService {
	/**
	 * 列出所有数据
	 * 
	 * @return
	 */
	public List<Windowdata> findAll();
	/**
	 * 分页结果集
	 * @param pageNum	分页后显示第几页
	 * @param pageSize	每页多少条数据
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 添加品牌
	 * @param brand	品牌信息的对象
	 */
	public void add(Windowdata windowdata);
	/**
	 * 查询单个
	 * @param id	主键值
	 * @return	主键对应的对象
	 */
	public Windowdata getOne(Long id);
	/**
	 * 更改品牌
	 * @param brand	更改品牌的对象
	 */
	public void update(Windowdata windowdata);
	/**
	 * 删除品牌
	 * @param ids	需要删除的主键数组
	 */
	public void delete(Long[] ids);
	/**
	 * 条件+分页查询
	 * @param brand	查询条件
	 * @param pageNum	分页后显示第几页
	 * @param pageSize	每页多少条数据
	 * @return
	 */
	public PageResult findPage(Windowdata windowdata,int pageNum,int pageSize); 
	
}
