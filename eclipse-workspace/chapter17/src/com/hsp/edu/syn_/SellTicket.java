package com.hsp.edu.syn_;

/*
 * 售票系统
 * 编程模拟三个售票窗口售票100
 * 分别使用继承 Thread和实现Runnable方式
 * 并分析有什么问题
 */

//使用多线程，模拟三个窗口同时开票
public class SellTicket {
	public static void main(String[] args) {

		// 测试
//		SellTicket01 sellTicket01 = new SellTicket01();
//		SellTicket01 sellTicket02 = new SellTicket01();
//		SellTicket01 sellTicket03 = new SellTicket01();
//		
//		//这里会出现超卖...
//		sellTicket01.start();//启动售票线程
//		sellTicket02.start();//启动售票线程
//		sellTicket03.start();//启动售票线程

//		System.out.println("===使用实现接口方式来售票===");
//		SellTicket02 sellTicket02 = new SellTicket02();
//		
//		new Thread(sellTicket02).start();//第1个线程-窗口
//		new Thread(sellTicket02).start();//第2个线程-窗口
//		new Thread(sellTicket02).start();//第3个线程-窗口

		// 测试
		System.out.println("===使用synchronized线程同步实现接口方式来售票===");
		SellTicket03 sellTicket03 = new SellTicket03();

		new Thread(sellTicket03).start();// 第1个线程-窗口
		new Thread(sellTicket03).start();// 第2个线程-窗口
		new Thread(sellTicket03).start();// 第3个线程-窗口

	}
}

//实现接口的方式，使用synchronized实现线程同步
class SellTicket03 implements Runnable {
	private int ticketNum = 100;
	private boolean loop = true;// 控制run方法的变量
	Object object = new Object();

	// 同步方法(静态的)的锁为当前类本身
	//1.下面静态方法，锁是加在SellTicket03.class
	//2.如果在静态方法中，实现一个同步代码块
	/*
	 * synchronized (SellTicket.class) {
	 *		System.out.println("m2");
	 *	}
	 * 
	 */
	public synchronized static void m1() {

	}

	public static void m2() {
		synchronized (SellTicket.class) {
			System.out.println("m2");
		}
	}

	// 1.public synchronized void sell(){} 这是一个同步方法
	// 2.这时 锁在this对象
	// 3.也可以在代码块上写synchronized，同步代码块，互斥锁还是在this对象
	public /* synchronized */void sell() {// 同步方法，在同一时刻，只能有一个线程执行sell()

		synchronized (/* this */ object) {
			if (ticketNum <= 0) {
				System.out.println("售票结束...");
				loop = false;
				return;// 返回调用方法的地方
			}
			// 休眠50毫秒,模拟
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数=" + (--ticketNum));
		}
	}

	@Override
	public void run() {// 3个线程同时操作run()
		while (loop) {

			sell();// sell方法时是同步方法
		}
	}
}

//使用Thread方式 
//售票系统SellTicket01
//底层是
//new sellTicket01().start()
//new sellTicket01().start()
//new sellTicket01().start()
class SellTicket01 extends Thread {
	private static int ticketNum = 100;
	// 同时售票，使用static共享
	// 让多个线程共享 TicketNum

//  必须保证多个线程的锁是同一个对象
//	public void m1() {
//		synchronized(this) {//多个线程的对象
//			System.out.println("hello");
//		}
//	}
	
	@Override
	public void run() {
		while (true) {

			if (ticketNum <= 0) {
				System.out.println("售票结束...");
				break;// 结束当前线程
			}
			// 休眠50毫秒,模拟
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数=" + (--ticketNum));// 1 -0
																												// --1
																												// --2
		}
	}
}

//实现接口的方式
class SellTicket02 implements Runnable {
	private int ticketNum = 100;

	@Override
	public void run() {
		while (true) {

			if (ticketNum <= 0) {
				System.out.println("售票结束...");
				break;// 结束当前线程
			}
			// 休眠50毫秒,模拟
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数=" + (--ticketNum));
		}
	}
}