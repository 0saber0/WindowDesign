package com.milanuo.window.glass;

import com.milanuo.window.pojo.Windowdata;
import com.milanuo.window.util.CTypeHigh;
import com.milanuo.window.util.WindowUtil;

public class ZhongCai88Glass {

	public static Double getAreas(Windowdata windowdata) {
		Double areas = 0.0;
		if (windowdata != null) {

			Integer inputheight = windowdata.getInputheight();
			Integer inputwidth = windowdata.getInputwidth();
			Integer inputnumber = windowdata.getInputnumber();

			if ("A1".equals(windowdata.getType())) {
				
				areas = (double) ((inputheight-165)*((inputwidth-5)/2-85)*(inputnumber*2)); 
				
			} else if ("A2".equals(windowdata.getType())) {
				
				Integer dH = WindowUtil.getBTypeHeight(inputheight);
				Integer tH = inputheight-WindowUtil.getBTypeHeight(inputheight);
				areas = (double) ((tH-75)*(inputwidth-75)*(inputnumber)+(dH-165)*((inputwidth-5)/2-85)*(inputnumber*2));
			
			} else if ("A3".equals(windowdata.getType())) {
				
				Integer dH = WindowUtil.getBTypeHeight(inputheight);
				Integer tH = inputheight-WindowUtil.getBTypeHeight(inputheight);
				areas = (double) ((tH-75)*((inputwidth-110)/2-5)*(inputnumber*2)+(dH-165)*((inputwidth-5)/2-85)*(inputnumber*2));
			
			} else if ("A4".equals(windowdata.getType())) {
			
				CTypeHigh cType = WindowUtil.getCType(inputheight);
				Integer dH = cType.getDownHigh();
				Integer mH = cType.getMidHigh();
				Integer tH = cType.getTopHigh();
				areas = (double) ((tH-75)*(inputwidth-75)*(inputnumber)+(dH-75)*(inputwidth-75)*(inputnumber)+(mH-165)*((inputwidth-5)/2-85)*(inputnumber*2));
				
			} else if ("A5".equals(windowdata.getType())) {

				CTypeHigh cType = WindowUtil.getCType(inputheight);
				Integer dH = cType.getDownHigh();
				Integer mH = cType.getMidHigh();
				Integer tH = cType.getTopHigh();
				areas = (double) ((tH-75)*((inputwidth-105)/2-5)*(inputnumber*2)+(dH-75)*((inputwidth-105)/2-5)*(inputnumber*2)+(mH-165)*((inputwidth-5)/2-85)*(inputnumber*2));
				
			}

		}
		return areas;
	}
}
