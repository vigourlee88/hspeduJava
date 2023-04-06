package com.hspedu.method_;

public class ThreadMethod02 {
	public static void main(String[] args) throws InterruptedException {
		
		T2 t2 = new T2();
		t2.start();
		
		for (int i = 0; i <= 20; i++) {
			Thread.sleep(1000);
			System.out.println("主线程吃了 " + i + " 包子");
			if(i == 5) {
				System.out.println("主线程 让 子线程 先吃");
				//join 线程插队
				//t2.join();//这里相当于让t2线程 先执行完毕
				
				Thread.yield();//礼让，不一定层共
				System.out.println("子线程吃完，主线程接着吃");
			}
		}
	}
}
class T2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();	
			}
			
			System.out.println("子线程吃了 " + i + " 包子");
		}
	}
}