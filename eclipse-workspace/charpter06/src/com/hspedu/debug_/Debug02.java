package com.hspedu.debug_;

public class Debug02 {
	public static void main(String[] args) {
		//debug数组越界异常
		int[] arr = {1,10,-1};
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("退出for循环");
	}
}
