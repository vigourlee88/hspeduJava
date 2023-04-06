package com.hspedu.threaduse_;

//main线程里启动两个子线程
public class Thread03 {
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();//启动第一个线程
		thread2.start();//启动第二个线程
		
		System.out.println("主线程完毕");
	}
}
class T1 implements Runnable{

	int count = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println("Hello,world " + (++count));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(count == 10) {
				break;
			}
		}
	}	
}
class T2 implements Runnable{
	
	int count = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println("hi " + (++count));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(count == 5) {
				break;
			}
		}
	}	
}