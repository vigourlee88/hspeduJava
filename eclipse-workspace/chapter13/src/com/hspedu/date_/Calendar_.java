package com.hspedu.date_;

import java.util.Calendar;

public class Calendar_ {
	public static void main(String[] args) {
		//1.Calendar是一个抽象类，并且构造器是Private
		//2.可以通过getInstance()来获取实例
		//3.提供大量的方法和字段提供给程序员
		//4.如果需要24小时进制来获取时间:Calendar.HOUR=>Calendar.HOUR_OF_DAY
		//	Calendar是私有的，无法new对象,而且是抽象的，无法实例化对象
		Calendar c = Calendar.getInstance();
		System.out.println("c=" + c);
		//获取日历对象的某个日历字段
		System.out.println("年:"+c.get(Calendar.YEAR));
		System.out.println("月:"+(c.get(Calendar.MONTH) + 1));
		System.out.println("日:"+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("小时:"+c.get(Calendar.HOUR));
		System.out.println("分钟:"+c.get(Calendar.MINUTE));
		System.out.println("秒:"+c.get(Calendar.SECOND));

		//Calendar没有专门的格式化方法，需要程序员自己来组合
		System.out.println(c.get(Calendar.YEAR)+ "年-"
				+(c.get(Calendar.MONTH) + 1) + "月-"
				+c.get(Calendar.DAY_OF_MONTH) + "日 "
						+c.get(Calendar.HOUR_OF_DAY) + "时:"
						+c.get(Calendar.MINUTE)	+ "分:"
						+c.get(Calendar.SECOND) + "秒");
	}
}
