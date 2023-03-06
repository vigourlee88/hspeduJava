package com.hspedu.final_;

public class FinalExercise02 {
	public static void main(String[] args) {
		
	}
}
class Something {
	public int addOne(final int x) {
	  //++x;//错误，不能修改final x 的值
		return x + 1;
	}
}