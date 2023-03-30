package com.hspedu.customergeneric_;

@SuppressWarnings({"all"})
public class CustomerGenericExercise {
	public static void main(String[] args) {
		//T = Double,R = String,M =Integer
		Tiger<Double,String,Integer> g = new Tiger<>("john");
		g.setT(10.9);//T = double ok
		//g.setT("yy");// 错误
		System.out.println(g);
		
		Tiger g2 = new Tiger("john~~");
		//以上创建默认T,R,M为Object类型
		g2.setT("yy");//yy字符串是T = Object的子类 ok
		System.out.println("g2=" + g2);
	}
}
