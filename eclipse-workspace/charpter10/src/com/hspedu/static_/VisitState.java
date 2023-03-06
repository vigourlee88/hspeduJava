package com.hspedu.static_;

public class VisitState {
	public static void main(String[] args) {
		//类名.变量名
		//说明，类变量是随着类的加载而创建，
		//所以即使没有创建实例对象也可以访问
		System.out.println(A.name);
		
		//通过 对象名.变量名
		A a = new A();
		System.out.println("a.name=" + a.name);
	}
	

}
class A{
	//类变量
	//类变量的访问，必须遵守 相关的访问权限
	public static String name = "hspedu";
	//普通属性/普通成员变量/非静态属性
	private int num = 10;
	
	
}
