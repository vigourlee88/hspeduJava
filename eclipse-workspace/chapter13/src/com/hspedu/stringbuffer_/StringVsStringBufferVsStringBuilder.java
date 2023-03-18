package com.hspedu.stringbuffer_;

public class StringVsStringBufferVsStringBuilder {
	public static void main(String[] args) {
		
		long startTime = 0L;
		long endTime = 0L;
		
		StringBuffer buffer = new StringBuffer("");	
		for(int i = 0;i < 20000;i++) {
			buffer.append(String.valueOf(i));
		}
		endTime =System.currentTimeMillis();
		System.out.println("StringBuffer的执行时间: "+ (endTime -startTime));
		
		
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 2000; i++) {
			builder.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的执行时间: "+ (endTime -startTime));
		
		
		String text = "";
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 2000; i++) {
			text = text + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String的执行时间: "+ (endTime -startTime));
	}
}
