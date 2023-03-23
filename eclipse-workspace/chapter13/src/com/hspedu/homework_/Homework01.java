package com.hspedu.homework_;

public class Homework01 {
	public static void main(String[] args) {
		//测试
		String str = "abcdef";
		System.out.println("===交换前===");
		System.out.println(str);
		try {
			str = reverse(str, 1, 44);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("===交换后===");
		System.out.println(str);
	}
	/*
	 * 将字符串中指定部分进行反转，比如a bcde f 反转成a edcb f
	 * 思路分析
	 * 1.先把方法定义确定
	 * 2.把String转成char[],因为char[]元素可以交换
	 * 3.画出分析示意图
	 * 4.代码实现
	 */
	public static String reverse(String str,int start,int end) {
		
		//对输入的参数做一个验证
		//编程技巧分享
		//1.写出正确的情况
		//2.然后取反即可
		if(!(str != null && start >= 0 && end > start && end < str.length())) {
			throw new RuntimeException("参数不正确");
		}
		char[] chars = str.toCharArray();
		char temp =' ';//交换辅助变量
		for (int i = start,j = end ; i < j; i++,j--) {
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		//原来的str不变
		//需要使用chars 重新构建一个String返回即可
		return new String(chars);
		
	}
}
