package com.hspedu.threaduse_;

//通过实现接口Runnable来 开发线程
public class Thread02 {
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		//dog.start();这里不能调用start
//		//创建了Thread对象，把dog对象(实现了Runnable),放入Thread
//		Thread thread = new Thread(dog);
//		thread.start();
		
		Tiger tiger = new Tiger();
		ThreadProxy threadProxy = new ThreadProxy(tiger);
		//Tiger实现了Runnable接口，可以放进去
	    //构造器ThreadProxy接收Runnable类型 target
		threadProxy.start();
		
	}
}
class Animal{}
class Tiger extends Animal implements Runnable{

	@Override
	public void run() {
		System.out.println("老虎嗷嗷叫..");
	}
}
//线程代理类，模拟了一个精简的Tread类
class ThreadProxy implements Runnable{//可以把Proxy类当做Thread类对待

	private Runnable target = null;//设置属性 类型是Runnable
	@Override
	public void run() {
	   if(target != null) {
			 target.run();//动态绑定<运行类型 Tiger(传入的是Tiger)>
	   }
	}
	//构造器
	public ThreadProxy(Runnable target) {
		super();
		this.target = target;
	}
	public void start() {
		start0();//这个方法真正实现了多线程方法
	}
	public void start0() {
		run();
	}
	
}
class Dog implements Runnable{

	int count = 0;
	@Override
	public void run() {//就是一个普通方法，不会启动线程	
		while(true) {
			System.out.println("小狗汪汪叫..hi" + (++count) + Thread.currentThread().getName());
			//休眠1秒
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
