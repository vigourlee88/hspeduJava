package com.hspedu.stringbuffer_;

public class StringBuffer02 {
	public static void main(String[] args) {
		//构造器的使用
		//1.创建一个 大小为16的char[],用于存放字符内容
		StringBuffer stringBuffer = new StringBuffer();
		
		//2.通过构造器指定char[] 大小
		StringBuffer stringBuffer2 = new StringBuffer(100);
		/*
		 * @IntrinsicCandidate
	    public StringBuffer(int capacity) {
	        super(capacity);
	    }
		 */
		//3.通过给一个String 创建StringBuffer
		//char[] 大小就是str.length() + 16;
		StringBuffer stringBuffer3 = new StringBuffer("hello");
	}
}
