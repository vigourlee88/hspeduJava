package com.hspedu.stringbuffer_;

public class StringBufferExercise02 {
	public static void main(String[] args) {
	/*
	 * 思路分析
	 * 1.定义一个Scanner对象 ，接收用户输入的价格String
	 * 2.希望使用StringBuffer的insert方法
	 * 需要将String 转成 zzzzStringBuffer
	 * 3.然后实用性相关方法进行字符串的处理
	 * 
	 */
	  //new Scanner(System.in);
		String price = "8123564.59";
	    //String -> StringBuffer
		StringBuffer sb = new StringBuffer(price);
		//先完成一个最简单的实现123,564.59
		//先找到小数点的索引，然后在该位置的前3位，插入，即可
		//int i = sb.lastIndexOf(".");	
		//sb = sb.insert(i-3, ",");
		//上面的2步需要做一个循环处理,才正确
		
		for(int i= sb.lastIndexOf(".")- 3;i > 0; i -= 3) {
			sb = sb.insert(i, ",");
		}
		System.out.println(sb);
	}
}
