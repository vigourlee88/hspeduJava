package com.hsp.edu.syn_;

public class DeadLock_ {
	public static void main(String[] args) {
		//模拟死锁现象
		DeadLockDemo A = new DeadLockDemo(true);
		A.setName("A线程");
		DeadLockDemo B = new DeadLockDemo(false);
		B.setName("B线程");
		A.start();
		B.start();
	}
}
//线程死锁
class DeadLockDemo extends Thread{
	//保证多个线程共享一个对象，这里使用static 
	static Object o1 = new Object();
	static Object o2 = new Object();
	boolean flag;
	public DeadLockDemo(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		
		//下面业务逻辑的分析
		//1.如果flag为T，线程A就会先得到 o1对象锁，然后去尝试获取o2对象锁
		//2.如果线程A 得不到o2对象锁，就会Blocked(阻塞)
		//3.如果flag为T，执行else后面，线程B就会先得到 o2对象锁，然后去尝试获取o1对象锁
		//4.如果线程B 得不到o1对象锁，就会Blocked(阻塞)
		if(flag) {
			synchronized(o1) {//对象互斥锁，下面是同步代码
				System.out.println(Thread.currentThread().getName() + "进入1");
				synchronized(o2) {
					System.out.println(Thread.currentThread().getName() + "进入2");
				}
			}
		}else {
			synchronized(o2) {
				System.out.println(Thread.currentThread().getName() + "进入3");
				synchronized(o1) {
					System.out.println(Thread.currentThread().getName() + "进入4");
				}
			}
		}
	}
}