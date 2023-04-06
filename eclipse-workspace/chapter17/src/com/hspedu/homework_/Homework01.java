package com.hspedu.homework_;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		A a = new A();
		//要把线程a对象传给b对象
		B b = new B(a);
		a.start();
		b.start();
	}
}
//直到第2个线程从键盘读取了"Q"命令
class B extends Thread{
	private A a;
	private Scanner scanner = new Scanner(System.in);

	public B(A a) {//构造器中，直接传入A类对象
		super();
		this.a = a;
	}
	
	@Override
	public void run() {
		while(true) {
			//接收用户输入
			System.out.println("请输入你的指令(Q)表示退出");
		    char key = scanner.next().toUpperCase().charAt(0);
			if(key == 'Q') {
				//以通知的方式结束a线程
				a.setLoop(false);
				System.out.println("b线程退出");//输入q回车
				break;
			}
		}
	
	}

	
	
}
//创建A线程类
class A extends Thread{
	private boolean loop = true;
	@Override
	public void run() {
		//输出1-100数字
		while(loop) {
			System.out.println((int)(Math.random()*100 + 1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("a线程退出qq");
	}
	
	//可以修改属性loop变量
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
}