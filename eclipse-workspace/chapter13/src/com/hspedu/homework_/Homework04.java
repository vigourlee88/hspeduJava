package com.hspedu.homework_;

public class Homework04 {
	public static void main(String[] args) {
		String str= "abcHsp U 1234";
		countStr(str);
	}
	/*
	 * 思路分析
	 * 1.遍历字符串，如果char 在'0'~'9'就是一个数字
	 * 2.如果char 在'a'~'z'就是一个小写字母
	 * 3.如果char 在'A'~'Z'就是一个大写字母
	 * 4.如果使用三个变量来记录 统计结果
	 * 
	 */
	public static void countStr(String str) {
		if(str == null) {
			System.out.println("str 不能为空");
			return;
		}
		int strLen = str.length();
		int numCount = 0;
		int lowerCount = 0;
		int upperCount = 0;
		int otherCount = 0;
		
		for (int i = 0; i < strLen; i++) {
			//字符数组不能用索引直接取，需要charAt()，某个位置字符取出来
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				numCount++;
				
			}else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lowerCount++;
				
			}else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upperCount++;
				
			}else {
				otherCount++;
			}
		}
		
		System.out.println("数字有 " + numCount);
		System.out.println("小写字母有 " + lowerCount);
		System.out.println("大写字母有 " + upperCount);
		System.out.println("其他字符有 " + otherCount);
	}
	
}
