package com.hspedu.innerClass_;

public class InnerClassExercise02 {
	public static void main(String[] args) {
		//测试手机类的闹钟功能
		//通过匿名内部类(对象)作为参数
		Cellphone cellPhone = new Cellphone();
		//分析
		//1.传递的是实现了Bell接口的匿名内部类InnerClassExercise02$1
		//2.重写了 ring方法
		//3.Bell bell = new Bell(){//匿名内部类
		//    @Override
		//    public void ring(){
		//        System.out.println("懒猪起床了");
		//    }
		//   };
		cellPhone.alarmClock(new Bell() {
			@Override
			public void ring() {
				System.out.println("懒猪起床了");
			}	
		});
		cellPhone.alarmClock(new Bell() {

			@Override
			public void ring() {
				System.out.println("小伙伴上课了");
			}	
		});
	}
}
interface Bell{//铃声接口
	 void ring();
}
class Cellphone {//手机类
	public void alarmClock(Bell bell) {//形参是Bell接口类型
		System.out.println(bell.getClass());
		bell.ring();//动态绑定
	}
}