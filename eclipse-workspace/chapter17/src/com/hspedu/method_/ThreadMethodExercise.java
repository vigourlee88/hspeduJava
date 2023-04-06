package com.hspedu.method_;

public class ThreadMethodExercise {
	public static void main(String[] args) throws InterruptedException {
		
		 Thread t3 = new Thread(new T3());//创建子线程t3
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("hi" + i);
			if(i == 5) {//说明主线程输出了5次
				t3.start();//启动子线程输出hello
				t3.join();//立即将t3子线程，插入到主线程，让t3先执行
				System.out.println("子线程结束");
			}
			Thread.sleep(1000);//输出一次 hi,让main也休眠1s
		}
		System.out.println("主线程结束");
		
	}
}
class T3 implements Runnable{

	private int count = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println("hello" + (++count));
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