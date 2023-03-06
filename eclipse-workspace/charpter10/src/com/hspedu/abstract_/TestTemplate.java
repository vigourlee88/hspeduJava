package com.hspedu.abstract_;

public class TestTemplate {
	public static void main(String[] args) {
		AA aa = new AA();
		//aa.job();
		aa.calculateTime();
		
		BB bb = new BB();//多态的动态绑定机制
		//bb.job();
		bb.calculateTime();
	}
}
