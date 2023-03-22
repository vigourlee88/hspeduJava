package com.hspedu.arrays_;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public class ArraysMethod02 {
	public static void main(String[] args) {
		Integer[] arr = {1,2,90,123,567};
		//binarySearch通过二分搜索法进行查找，要求必须排好序
		//1.如果使用binarySearch二叉查找
		//2.要求该数组是有序的，如果该数组是无序的，不能使用二叉法
		//3.如果数组中不存在该元素，返回-1
		int index = Arrays.binarySearch(arr,-123);
		System.out.println("index=" + index);
		
		//copyOf数组元素的复制
		//1.从arr数组中，拷贝arr.length个元素到newArr数组中
		//2.如果拷贝的长度>arr.length 就在新数组的后面 增加null
		//3.如果拷贝的长度<0,就抛出异常NegativeArraySizeException
		//4.该方法的底层使用的是System.arraycopy()
		Integer[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println("==拷贝执行完毕后==");
		System.out.println(Arrays.toString(newArr));
		
		//fill数组元素的填充
		Integer[] num = new Integer[] {9,3,2};
		//1.使用99去填充num数组，可以理解成是替换原来的元素
		Arrays.fill(num, 99);
		System.out.println("==num数组填充后==");
		System.out.println(Arrays.toString(num));
		
		//equals 比较两个数组元素内容是否完全一致
		Integer[] arr2 = {1,2,90,123,567};
		boolean equals = Arrays.equals(arr,arr2);
		System.out.println(equals);
		
		//asList 将一组值，转换成List
		//1.调用asList方法，将数据转成一个List集合
		//2.返回的 asList 编译类型 List(接口)
		//3.asList运行类型 java.util.Arrays#ArrayList,
		//是Arrays类的静态内部类
		//private static class ArrayList<E> extends AbstractList<E>
		//implements RandomAccess, java.io.Serializable
		List<Integer> asList = Arrays.asList(2,3,4,5,1);
		System.out.println("asList=" + asList);
	}
}
