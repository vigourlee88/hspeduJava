package com.hspedu.exception_.homework_;

public class Homework02 {
	public static void main(String[] args) {
		//args.length = 0;
		//这里先发生的是ArrayIndexOutOfBoundsException
		
		if(args[4].equals("john")) {//可能发生空指针异常
			System.out.println("AA");
		}else {
			System.out.println("BB");
		}
		Object o = args[2];//String->Object,向上转型
		//Integer i = (Integer) o;//错误，这里一定会发生ClassCastException
		String i = (String) o;
	}
}
