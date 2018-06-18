package util;

import java.util.ArrayList;
import java.util.List;

import com.milanuo.window.pojo.BaseType;
import com.milanuo.window.pojo.Windowdata;
import com.milanuo.window.util.CTypeHigh;
import com.milanuo.window.util.WindowUtil;

/**
 * 封装service重复使用的方法
 * 
 * @author 51988
 *
 */
public class ServiceUtil {
	// 从结果集中封装A1的方法
	public static List<BaseType> findA1(List<Windowdata> listAll) {

		List<BaseType> listA1 = new ArrayList<>();
		for (Windowdata windowdata : listAll) {
			if ("A1".equals(windowdata.getType())) {
				BaseType A1Type = new BaseType();
				listA1.add(A1Type);
				A1Type.setiH(windowdata.getInputheight());
				A1Type.setiW(windowdata.getInputwidth());
				A1Type.setiN(windowdata.getInputnumber());
			}
		}
		return listA1;
	}

	// 从结果集中封装A2的方法
	public static List<BaseType> findA2(List<Windowdata> listAll) {

		List<BaseType> listA2 = new ArrayList<>();
		for (Windowdata windowdata : listAll) {
			if ("A2".equals(windowdata.getType())) {
				BaseType A2Type = new BaseType();
				listA2.add(A2Type);
				A2Type.setiH(windowdata.getInputheight());
				A2Type.setiW(windowdata.getInputwidth());
				A2Type.setiN(windowdata.getInputnumber());
				A2Type.setdH(WindowUtil.getBTypeHeight(windowdata.getInputheight()));
				A2Type.settH(windowdata.getInputheight() - WindowUtil.getBTypeHeight(windowdata.getInputheight()));
			}
		}
		return listA2;
	}

	// 从结果集中封装A3的方法
	public static List<BaseType> findA3(List<Windowdata> listAll) {

		List<BaseType> listA3 = new ArrayList<>();
		for (Windowdata windowdata : listAll) {
			if ("A3".equals(windowdata.getType())) {
				BaseType A3Type = new BaseType();
				listA3.add(A3Type);
				A3Type.setiH(windowdata.getInputheight());
				A3Type.setiW(windowdata.getInputwidth());
				A3Type.setiN(windowdata.getInputnumber());
				A3Type.setdH(WindowUtil.getBTypeHeight(windowdata.getInputheight()));
				A3Type.settH(windowdata.getInputheight() - WindowUtil.getBTypeHeight(windowdata.getInputheight()));
			}
		}
		return listA3;
	}

	// 从结果集中封装A4的方法
	public static List<BaseType> findA4(List<Windowdata> listAll) {

		List<BaseType> listA4 = new ArrayList<>();
		for (Windowdata windowdata : listAll) {
			if ("A4".equals(windowdata.getType())) {
				BaseType A4Type = new BaseType();
				listA4.add(A4Type);
				A4Type.setiH(windowdata.getInputheight());
				A4Type.setiW(windowdata.getInputwidth());
				A4Type.setiN(windowdata.getInputnumber());
				CTypeHigh cType = WindowUtil.getCType(windowdata.getInputheight());
				A4Type.settH(cType.getTopHigh());
				A4Type.setmH(cType.getMidHigh());
				A4Type.setdH(cType.getDownHigh());
			}
		}
		return listA4;
	}

	// 从结果集中封装A5的方法
	public static List<BaseType> findA5(List<Windowdata> listAll) {

		List<BaseType> listA5 = new ArrayList<>();
		for (Windowdata windowdata : listAll) {
			if ("A5".equals(windowdata.getType())) {
				BaseType A5Type = new BaseType();
				listA5.add(A5Type);
				A5Type.setiH(windowdata.getInputheight());
				A5Type.setiW(windowdata.getInputwidth());
				A5Type.setiN(windowdata.getInputnumber());
				CTypeHigh cType = WindowUtil.getCType(windowdata.getInputheight());
				A5Type.settH(cType.getTopHigh());
				A5Type.setmH(cType.getMidHigh());
				A5Type.setdH(cType.getDownHigh());
			}
		}
		return listA5;
	}

	// 计算结果集中所有窗户的总面积
	public static Double areas(List<Windowdata> listAll) {

		Double totleAreas = 0.0;
		for (Windowdata windowdata : listAll) {

			Integer inputheight = windowdata.getInputheight();

			Integer inputwidth = windowdata.getInputwidth();

			Integer inputnumber = windowdata.getInputnumber();

			totleAreas += inputheight * inputwidth * inputnumber;
		}

		return totleAreas;
	}
}
