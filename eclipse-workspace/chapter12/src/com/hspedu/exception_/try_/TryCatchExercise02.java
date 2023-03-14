package com.hspedu.exception_.try_;

public class TryCatchExercise02 {
	public static void main(String[] args) {
		System.out.println(Exception02.method());
	}
}
class Exception02{
	public static int method() {
		int i = 1;
		try {
			i++;//i=2
			String[] names = new String[3];
			if(names[1].equals("tom")) {//空指针异常
				System.out.println(names[1]);
			}else {
				names[3] = "hspedu";
			}
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			return 2;
		}catch(NullPointerException e) {//捕捉异常
			return ++i;//i=3
		}finally {//必须执行
			return ++i;//i=4
		}
	}
	
}