package com.hspedu.exception_.custom_;

public class CustomException {
	public static void main(String[] args) throws AgeException {
		
		int age = 180;
		//要求范围在18-120之间，否则抛出一个自定义异常
		if(!(age >= 18 && age <=120)) {//抛给调用者main
			//这里我们可以通过构造器.设置信息
			throw new AgeException("年龄需要在18-120之间");
		}
		System.out.println("你的年龄范围正确.");
	}
}
//自定义一个异常
//1.一般情况下，我们定义异常继承RuntimeException
//2.即把自定义异常做成 运行时异常，好处是，我们可以使用默认的处理机制
class AgeException extends Exception {
	public AgeException(String message) {
		super(message);//父类构造器RuntimeException
	}	
}
