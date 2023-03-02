package com.hspedu.debug_;

import java.util.Arrays;

public class Debug03 {
	public static void main(String[] args) {
		//debug 源码
		int arr[] = {1,-1,10,-20,100};
		//排序，Arrays.sort方法的底层实现
		//->debug快捷键，F5,F7,step over
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
