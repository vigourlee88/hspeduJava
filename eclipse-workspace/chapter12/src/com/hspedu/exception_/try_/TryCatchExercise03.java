package com.hspedu.exception_.try_;

public class TryCatchExercise03 {
	public static void main(String[] args) {
		System.out.println(Exception03.method());
	}
}
class Exception03{
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
		return ++i;//i=3 保存到临时变量中temp = 3;
	}finally {//必须执行
		++i;//i=4
		System.out.println("i=" + i);//i=4
	}
}
}

