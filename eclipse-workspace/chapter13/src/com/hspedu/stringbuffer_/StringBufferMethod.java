package com.hspedu.stringbuffer_;

public class StringBufferMethod {
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("hello");
		
		s.append(",");
		s.append("张三丰");
		s.append("赵敏").append(100).append(true).append(10.5);
		//本质调用toString方法
		System.out.println(s);
		
		//删除索引为>=start && <end处的字符
		s.delete(11, 14);
		System.out.println(s);
		
		s.replace(9, 11, "周芷若");
		System.out.println(s);
		
		//查找指定的子串在字符串第一次出现的索引，如果找不到返回-1
		int indexOf = s.indexOf("张三丰");
		System.out.println(indexOf);
		
		s.insert(9, "赵敏");
		System.out.println(s);
		
		System.out.println(s.length());
		System.out.println(s);
	}
}
