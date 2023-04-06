package com.hspedu.method_;

public class ThreadMethod01 {
	public static void main(String[] args) throws InterruptedException {
		//测试相关的方法
		T t = new T();
		t.setName("hsp");
		t.setPriority(Thread.MIN_PRIORITY);//1
		t.start();//启动子线程
		
		//主线程打印5 个hi,然后我就中断 子线程的休眠
		for (int i = 0; i < 5; i++) {
			Thread.sleep(5000);
			System.out.println("hi" + i);
		}
		
		System.out.println(t.getName() + " 线程的优先级=" + t.getPriority());
		//当执行到这里，就会中断 t线程的休眠
		t.interrupt();
	}
}
class T extends Thread{//自定的线程类
	@Override
	public void run() {
		while(true) {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " 吃包了~~~" + i);
				try {
					System.out.println(Thread.currentThread().getName() + " 休眠中~~~");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					//当该程序执行到一个interrupt方法时，就会catch一个异常，可以加入自己的业务代码
					//InterruptedException是捕获到一个中断异常
					System.out.println(Thread.currentThread().getName() + " 被interrupt了~~~");
				}
			}
		}
	 
	}
}