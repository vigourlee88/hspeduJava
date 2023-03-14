package com.hspedu.string_;

public class String01 {
	public static void main(String[] args) {
		//1.String 对象用于保存字符串，也就是一组字符序列
		//2."jack"是字符串常量，双引号括起的字符序列
		//3.字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
		//4.String 类有很多构造器，构成了构造器的重载
		//5.实现了Serializable接口，可以串行化，可以网络传输
		//6.实现了Comparable接口，String对象可以比较大小
		//7.String 是final类，不能被其他类继承
		//8.String 有属性private final char value[];用于存放字符串内容
		//9.注意这个value是一个final类型，赋值后，不可以修改(value的地址)
		String name = "jack";
		name = "tom";
		final char[] value = {'a','b','c'};
		char[] v2 = {'t','o','m'};
		value[0] = 'H';
		//value =v2;不可修改value地址
	}
}
