package com.hspedu.Annotation_;

public class Deprecated_ {
	public static void main(String[] args) {
		A a = new A();
		a.hi();
		System.out.println(a.n1);
	}

}
//1.@Deprecated 修饰某个元素，表示该元素已过时
//2.即不再推荐使用，但是仍然可以使用
//3.查看源码 是一个注解类 @interface
//4.可以修饰方法，类，字段，包，参数等
//5.可以做到版本升级的过渡使用
@Deprecated
class A{
	@Deprecated
	public int n1 = 10;
	@Deprecated
	public void hi() {
		
	}
}