package com.hspedu.method_;

public class ThreadMethod03 {
	public static void main(String[] args) throws InterruptedException {
		MyDaemonThread myDaemonThread = new MyDaemonThread();
		//如果我们希望主线程结束后，子线程自动结束
		//只需将 子线程 设置成 守护线程 即可
		myDaemonThread.setDaemon(true);
		myDaemonThread.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("宝强在辛苦的工作...");
			Thread.sleep(1000);
		}
	}
}
class MyDaemonThread extends Thread{
	@Override
	public void run() {
		for(;;) {//无限循环
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("马蓉和宋义快乐聊天，哈哈哈~~");
		}
	
	}
}