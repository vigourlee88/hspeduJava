package com.hspedu.exception_.try_;

public class TryCatchExercise01 {
	public static void main(String[] args) {
		//静态方法可以直接调用
		System.out.println(Exception01.method());
	}
}
class Exception01{
	public static int method() {
	 try{
			String[] names = new String[3];//数组元素默认为null
			if (names[1].equals("tom")) {//空指针异常
				System.out.println(names[1]);
			} else {
				names[3] = "hspedu";
			}
			return 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			return 2;
		} catch (NullPointerException e) {//捕获异常
			return 3;
		} finally {//必须要执行的
			return 4;//返回4
		}
	}
}