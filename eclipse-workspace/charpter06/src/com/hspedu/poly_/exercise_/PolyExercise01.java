package com.hspedu.poly_.exercise_;

public class PolyExercise01 {
	public static void main(String[] args) {
		double d = 13.4; //ok
		long l =(long) d;//ok
		System.out.println(l);//13
		int in =5;//ok
		//boolean b = (boolean) in;不对 boolean => int
		Object obj = "Hello";//可以 向上转型,多态
		String objStr = (String) obj;//可以 向下转型
		System.out.println(objStr);//Hello
		
		Object objPri = new Integer(5);//可以 Integer—》Object向上转型
		String str = (String) objPri;
		//错误，ClassCastException,指向Integer的父类引用强转成String引用
		Integer str1 = (Integer) objPri;//ok 向下转型
		
	}

}
