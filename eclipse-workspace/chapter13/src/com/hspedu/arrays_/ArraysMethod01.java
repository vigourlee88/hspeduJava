package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Integer[] integers = {1,20,90};
//		for (int i = 0; i < integers.length; i++) {
//			System.out.println(integers[i]);
//		}
		//直接使用Arrays.toString方法，显示数组
//		System.out.println(Arrays.toString(integers));
		
		//演示sort方法的使用
		
		Integer arr[] = {1,-1,7,8,89};
		//1.使用冒泡排序，也可以使用Arrays提供的sort()方法排序
		//2.因为数组是引用类型，所以通过sort排序后，会直接影响实参 arr
		//3.sort重载的，也可以通过传入一个接口Comparator,来实现定制排序
		//4.调用定制排序时，传入两个参数(1)排序的数组arr
		//(2)实现了Comparator接口的匿名内部类，要求实现Compare方法
		//5.这里体现接口编程的方式
		//源码分析
		//(1)Arrays.sort(arr,new Comparator()
		//(2)最终到TimSort类的private static <T> void binarySort(T[] a,int lo,int hi,int start ，
		//                       Comparator<? super T> c() 
		//(3)执行到binarySort方法的代码,会根据动态绑定机制 c.compare()执行我们传入的
		//匿名内部类的compare()
		//
		//  while(left < right){
		//       int mid =(left + right) >>>1;
		//       if(c.compare(privot,a[mid] < 0)
		//            right =mid;
		//       else
		//            left = mid + 1;
		//       }
		//(4)new 匿名内部类
		//(5)public int compare(Object o1, Object o2)
		//返回的值>0还是<0,会影响整个排序结果
		//这就充分体现了接口编程+动态绑定+匿名内部类的综合使用
		//Arrays.sort(arr);//默认排序方法
		//定制排序
		Arrays.sort(arr, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
			
				return i2 - i1;
			}	
		});
		
		System.out.println("====排序后====");
		System.out.println(Arrays.toString(arr));
	}
}
