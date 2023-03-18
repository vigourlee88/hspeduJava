package com.hspedu.stringbuffer_;

public class StringBuffer01 {
	public static void main(String[] args) {
		//1.StringBuffer的直接父类是AbstractStringBuffer
		//2.StringBuffer 实现了Serializable,即StringBuffer的对象可以串行化
		//3.在父类中，AbstractStringBuffer有属性 char[] value,不是final类型
		// 该value 数组存放 字符串内容，因此是存放在 堆中
		//4.StringBuffer 是一个final类，不能被继承
		//5.StringBuffer 字符内容是存在char[] value中，所以在变化时(添加或删除)，
		//不用每次都更换地址(即不是每次创建新对象)，效率高于String
		StringBuffer stringBuffer = new StringBuffer("hello");
	}
}
