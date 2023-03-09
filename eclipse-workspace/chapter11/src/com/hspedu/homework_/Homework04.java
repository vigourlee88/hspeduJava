package com.hspedu.homework_;

public class Homework04 {
	//考察对匿名内部类的使用
	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		//1.匿名内部类是
		/*运行类型是匿名内部类
		  new ICalculate() {
				@Override
				public double work(double n1,double n2) {
					return n1 + n2;
				}
		   },同时是一个对象
		   它的编译类型是接口类型,运行类型是匿名内部类 iCalculate.work(n1,n2)
		 */
		cellphone.testWork(new ICalculate() {
			@Override
			public double work(double n1,double n2) {
				return n1 + n2;//返回给result
			}
		}, 10, 8);//18.0
		
		cellphone.testWork(new ICalculate() {

			@Override
			public double work(double n1, double n2) {
				return n1 * n2;
			}		
		}, 10, 8);//80.0
	}
}
interface ICalculate{
	//完成计算，没有具体要求，自己设计
	//该方法完成怎样的计算，交给匿名内部类完成
	public double work(double n1,double n2);
}
class Cellphone {
	//当我们调用testWork(),
	//直接传入一个实现了ICalculate接口的匿名内部类即可
	//该匿名内部类，可以灵活的实现work,完成不同的计算任务
	//要求ICalculate对象的testWork()
	public void testWork(ICalculate iCalculate,double n1,double n2) {
		double result = iCalculate.work(n1,n2);//动态绑定，运行类型是匿名内部类，找到其work()
		System.out.println("计算后结果是="+ result);
	}
}