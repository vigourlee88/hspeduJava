package com.hspedu.bigdecimal_;

import java.math.BigDecimal;

public class BigDecimal_ {
	public static void main(String[] args) {
		
		//当我们需要保存一个精度很高的数时，double不够用
//		double d = 1999.11111111111999999999d;
//		System.out.println(d);
		
		BigDecimal bigDecimal = new BigDecimal("1999.1111119999999999");
		BigDecimal bigDecimal2 = new BigDecimal("2");
		System.out.println(bigDecimal);
		
		//1.如果对BigDecimal进行运算，比如加减乘除，需要使用对应的方法
		//2.创建一个需要操作的BigDecimal然后调用相应的方法即可
		System.out.println(bigDecimal.add(bigDecimal2));
		System.out.println(bigDecimal.subtract(bigDecimal2));
		System.out.println(bigDecimal.multiply(bigDecimal2));
		System.out.println(bigDecimal.divide(bigDecimal2));//可能抛出算术异常
		//在调用divide方法时，指定精度即可。BigDecimal.ROUND_CEILING
		//如果有无限循环小数，就会保留分子的精度
		System.out.println(bigDecimal.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
	}
}
