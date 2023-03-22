package com.hspedu.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
	public static void main(String[] args) throws ParseException {
		Date d1 = new Date();//截取当前的系统时间
		Date d2 = new Date(923567);//通过指定毫秒数得到时间
		System.out.println(d1.getTime());//获取某个时间对应的毫秒数
		System.out.println("d2="+ d2);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
		String format = sdf.format(d1);//将日期转换成指定格式的字符串
		System.out.println("当前日期=" + format);
		
		//1.可以把一个格式化的String 转成对应的Date
		//2.得到Date仍然在输出时，还是按照国外的形式
		//如果希望指定格式输出，需要转换SimpleDateFormat
		//3.在把一个String =>Date,使用sdf格式需要和你给的String 格式一样，否则会抛出转换异常
		String s = "1996年01月01日 10:20:30 月";
		Date parse =sdf.parse(s);
	  //System.out.println("parse="+ parse);
		System.out.println("parse="+ sdf.format(parse));
	}
}

