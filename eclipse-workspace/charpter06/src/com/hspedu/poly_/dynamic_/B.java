package com.hspedu.poly_.dynamic_;

public class B extends A{
	public int i =20;
	
//	public int sum() {
//		return i + 20;
//	}
	public int getI() {//子类getI()
		return i;//哪里声明，那里使用
	}
//	public int sum1() {
//		return i +10;
//		
//	}

}
