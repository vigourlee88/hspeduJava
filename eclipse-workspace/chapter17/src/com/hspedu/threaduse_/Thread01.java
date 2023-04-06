package com.hspedu.threaduse_;

public class Thread01 {
	public static void main(String[] args) throws InterruptedException {
		//创建一个Cat对象，可以当成线程使用
		Cat cat = new Cat();
		//cat.run();
		//run()方法就是一个普通的方法，没有真正的启动一个程序，就会把run方法执行完毕，才向下执行，不是体现多线程，而是串行
		
		/*
		 * 源码解读
		 * 1.
		 * public synchronized void start(){
		 *    start0();
		 * }
		 * 2.
		 * start0()是本地方法，是JVM机调用的，底层是C/C++实现
		 * 真正实现多线程的效果 是start0(),而不是run()
		 * private native void start0();
		 */
		cat.start();//启动线程->最终会执行cat的run方法
		//说明: 当main线程启动一个子线程Thread-0,主线程不会阻塞，会继续执行
		
		System.out.println("主线程继续执行"+ Thread.currentThread().getName());//main
		for (int i = 0; i < 10; i++) {
			System.out.println("主线程 i=" + i);
			//让主线程休眠
			Thread.sleep(1000);
		}
	}
}
/*
 * 1.当一个类继承Thread类，该类就可以当做线程使用
 * 2.我们会重写run方法，写上自己的业务代码
 * 3.run: Thread类 实现了Runable接口的run方法
 *  @Override
    public void run() {
        Runnable task = holder.task;
        if (task != null) {
            task.run();
        }
    }
 */

class Cat extends Thread {
	
	int times = 0;
	//重写run方法，写入自己的业务逻辑
	@Override
	public void run() {
		while(true) {
			System.out.println("喵喵，我是小猫咪" +(++times));
			System.out.println("线程名=" + Thread.currentThread().getName());
			//让该线程休眠1秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(times == 80) {
				break;//times到80，就退出while循环，线程就退出
			}
		}
	}
}