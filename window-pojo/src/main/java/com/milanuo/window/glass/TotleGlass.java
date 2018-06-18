package com.milanuo.window.glass;

import java.util.List;

import com.milanuo.window.pojo.Windowdata;

public class TotleGlass {

	public static Double getTotleAreas(List<Windowdata> listAll) {
		Double areas = 0.0;
		if (listAll != null&&listAll.size()>0) {
			for (Windowdata windowdata : listAll) {
				if ("中财88".equals(windowdata.getMaterialstype())) {
					areas += ZhongCai88Glass.getAreas(windowdata);
				}
				if ("中财80".equals(windowdata.getMaterialstype())) {
					areas += ZhongCai80Glass.getAreas(windowdata);
				}
				if ("新中财80".equals(windowdata.getMaterialstype())) {
					areas += XinZhongCai80Glass.getAreas(windowdata);
				}
				if ("力尔88".equals(windowdata.getMaterialstype())) {
					areas += LiEr88Glass.getAreas(windowdata);
				}
				if ("德玛斯88".equals(windowdata.getMaterialstype())) {
					areas += DeMaSi88Glass.getAreas(windowdata);
				}
			}
		}
		return areas;
	}
}
