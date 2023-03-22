package com.hspedu.homework_;

public class Homework02 {
	public static void main(String[] args) {
		
		String name = "tom";
		String pwd = null;
		String email = "ti.i@sohu.com";
		
		try {
			userRegister(name, pwd, email);
			//如果没有抛异常
			System.out.println("恭喜你，注册成功~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/*
	 * 思路分析
	 * 1.先编写方法userRegister(String name,String pwd,String email){}
	 * 2.针对输入的内容进行校验，如果发现有问题，就抛出异常，给出提示
	 * 3.单独写一个方法判断某个密码是否全是数字字符boolean
	 */
	public static void userRegister(String name,String pwd,String email) {
		//再加入一些校验
		if(!(name != null && pwd != null && email != null)) {
			throw new RuntimeException("参数不能为null");
		}
		//过关卡
		//第1关
		int userLength = name.length();
		if(!(userLength >= 2 && userLength <= 4)) {
			throw new RuntimeException("用户名长度为2或3或4");
		}
		//第2关
		if(!(pwd.length() == 6 && isDigital(pwd))) {
			throw new RuntimeException("密码长度为6,要求全是数字");
		}
		//第3关
		int i = email.indexOf('@');
		int j = email.indexOf('.');
		if(!(i > 0 && j > i)) {
			throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
		}
		
	}
	//单独写一个方法判断某个密码是否全是数字字符boolean
	public static boolean isDigital(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] < '0' || chars[i] >'9') {
				return false;
			}	
		}
		return true;
	}
}
