package com.hspedu.string_;

public class StringBuilder01 {
	public static void main(String[] args) {
	
		//1.继承AbstractStringBuilder类
		//2.实现了Serializable，可以串行化，即该对象可以保存到文件中，可以进行网络传输
		//3.是final类，不能被继承
		//4.对象的字符序列仍然是存在其父类AbstractStringBuilder类char[] value
		//  因此，字符序列是堆中
		//5.StringBuilder的方法，没有做互斥的处理,即没有synchronized关键字
		//  因此在单线程的情况下使用，
		StringBuilder stringBuilder = new StringBuilder();
		
	}
}
