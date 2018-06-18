package com.milanuo.window.util;

/**
 * 窗户设计工具类
 * 
 * @author 51988
 *
 */
public class WindowUtil {

	/**
	 * 获取B型窗户推拉框的高度
	 * 
	 * @param height
	 *            输入的窗户高度
	 * @return 推拉框的高度
	 */
	public static Integer getBTypeHeight(Integer height) {
		int h1 = height/3*2;
		if (h1 % 50 >= 25) {
			return (h1/50+1)*50;
		}else {
			return h1/50*50;
		}
	}

	/**
	 * 获取C型窗户推拉框的高度
	 * @param height	输入的窗户高度
	 * @return	三段对应的高度封装的对象
	 */
	public static CTypeHigh getCType(Integer height) {
		CTypeHigh cTypeHigh = new CTypeHigh();
		int h1 = height * 20 / 46;
		int h2 = height * 16 / 46;
		
		if (h1 % 50 >= 25) {
			cTypeHigh.setMidHigh((h1/50+1)*50);
		}else {
			cTypeHigh.setMidHigh(h1/50*50);
		}
		
		if (h2 % 50 >= 25) {
			cTypeHigh.setDownHigh((h2/50+1)*50);
		}else {
			cTypeHigh.setDownHigh(h2/50*50);
		}
		cTypeHigh.setTopHigh(height-cTypeHigh.getDownHigh()-cTypeHigh.getMidHigh());
		return cTypeHigh;
	}

	public static void main(String[] args) {
		Integer movingFrameHeight = WindowUtil.getBTypeHeight(1650);
		System.out.println(movingFrameHeight);
		//CTypeHigh cTypeHigh = WindowUtil.getCType(2325);
		//System.out.println(cTypeHigh.getTopHigh());
		//System.out.println(cTypeHigh.getMidHigh());
		//System.out.println(cTypeHigh.getDownHigh());
	}
}
