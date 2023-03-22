package com.hspedu.bignum_;

import java.math.BigInteger;

public class BigInteger_ {
	public static void main(String[] args) {
		
		//需要处理很大的整数，long不够用
		//可以使用BigInteger的类来搞定
//		long l = 237888889999l;
//		System.out.println("l"+ l);
		
		BigInteger bigInteger = new BigInteger("237888889999");
		BigInteger bigInteger2 = new BigInteger("100");
		
		System.out.println(bigInteger);
		
		//1.在对BigInteger进行加减乘除的时候，需要使用对应的方法，不能直接进行+-*/
		//2.可以创建一个要操作的BigInteger然后进行相应操作
		BigInteger add = bigInteger.add(bigInteger2);
		System.out.println(add);
		BigInteger subtract = bigInteger.subtract(bigInteger2);
		System.out.println(subtract);//减
		BigInteger multiply = bigInteger.multiply(bigInteger2);
		System.out.println(multiply);
		BigInteger divide = bigInteger.divide(bigInteger2);
		System.out.println(divide);
	}
}
