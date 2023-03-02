package com.hspedu.debug_;

import java.util.Arrays;

//演示执行到下一个断点，同时支持动态下断点
public class Debug04 {
	public static void main(String[] args) {
		
		int arr[] = {1,-1,10,-20,100};
		//排序，Arrays.sort方法的底层实现
		//->debug快捷键，resume 可以直接执行到下一个断点，
		//也可以在debug中动态的下断点
		//也支持在原本的系统中的jdk里下断点
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("hello100");
		System.out.println("hello200");
		System.out.println("hello300");
		System.out.println("hello400");
		System.out.println("hello500");
		System.out.println("hello600");
		System.out.println("hello700");
		
	}

}
