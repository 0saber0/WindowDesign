package com.milanuo.window.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.milanuo.window.glass.TotleGlass;
import com.milanuo.window.mapper.WindowdataMapper;
import com.milanuo.window.pojo.BasePageResult;
import com.milanuo.window.pojo.Windowdata;
import com.milanuo.window.pojo.WindowdataExample;
import com.milanuo.window.pojo.WindowdataExample.Criteria;
import com.milanuo.window.service.Zhongcai80Service;

import util.ServiceUtil;

/**
 * 服务接口实现
 * 
 * @author 51988
 *
 */
@Service
public class Zhongcai80ServiceImpl implements Zhongcai80Service {

	@Autowired
	private WindowdataMapper windowdataMapper;

	// 添加数据
	public void add(Windowdata windowdata) {

		Integer inputheight = windowdata.getInputheight();
		Integer inputwidth = windowdata.getInputwidth();

		if (inputheight < 1400) {// 如果高小于1400，就是A1
			windowdata.setType("A1");
		} else if (inputheight <= 2200) {// 如果高大于1400，小于2200
			if (inputwidth < 1400) {// A2
				windowdata.setType("A2");
			} else {// A3
				windowdata.setType("A3");
			}
		} else {
			if (inputwidth < 1400) {// A4
				windowdata.setType("A4");
			} else {// A5
				windowdata.setType("A5");
			}
		}
		windowdata.setMemorydate(new Date());
		windowdataMapper.insert(windowdata);
	}

	// 条件查询+分页查询
	public BasePageResult findPage(Windowdata windowdata, int pageNum, int pageSize) {

		PageHelper.startPage(pageNum, pageSize);
		WindowdataExample example = new WindowdataExample();
		Criteria criteria = example.createCriteria();
		criteria.andMaterialstypeEqualTo("中财80");

		if (windowdata != null) {
			if (windowdata.getType() != null && !"".equals(windowdata.getType().trim())) {
				criteria.andTypeEqualTo(windowdata.getType());
			}
			if (windowdata.getMemorydate() != null) {

				Calendar calendar = Calendar.getInstance();
				calendar.setTime(windowdata.getMemorydate());
				calendar.set(Calendar.HOUR_OF_DAY, 0);
				calendar.set(Calendar.MINUTE, 0);
				calendar.set(Calendar.SECOND, 0);
				Date start = calendar.getTime();
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				calendar.add(Calendar.SECOND, -1);
				Date end = calendar.getTime();

				criteria.andMemorydateBetween(start, end);
			}
		}

		Page<Windowdata> page = (Page<Windowdata>) windowdataMapper.selectByExample(example);

		List<Windowdata> listAll = page.getResult();

		return new BasePageResult(page.getTotal(), ServiceUtil.areas(listAll), TotleGlass.getTotleAreas(listAll),
				ServiceUtil.findA1(listAll), ServiceUtil.findA2(listAll), ServiceUtil.findA3(listAll),
				ServiceUtil.findA4(listAll), ServiceUtil.findA5(listAll));
	}

}
