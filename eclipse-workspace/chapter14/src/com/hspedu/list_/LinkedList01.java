package com.hspedu.list_;

public class LinkedList01 {
	public static void main(String[] args) {
		
		Node jack = new Node("jack");
		Node tom = new Node("tom");
		Node hsp = new Node("老韩");
		
		//连接三个节点，形成双向链表
		//jack ->tom ->hsp
		jack.next = tom;
		tom.next= hsp;
		//hsp->tom->jack
		hsp.pre = tom;
		tom.pre = jack;
		
		Node first = jack;//让first引用指向jack,双向列表的一个头结点
		Node last = hsp;//让last引用指向hsp,双向列表的一个尾结点
		
		//从头到尾进行遍历
		System.out.println("==从头到尾进行遍历==");
		while(true) {
			if(first == null) {
				break;//退出循环
			}
			System.out.println(first);
			first = first.next;
		}
		
		//从尾到头进行遍历
		System.out.println("==从尾到头进行遍历==");
		while(true) {
			if(last == null) {
				break;//退出循环
			}
			System.out.println(last);
			last = last.pre;
		}
		//演示链表的添加对象/数据 非常方便
		//是在tom---老韩 之间插入一个对象 张飞
		//1.先创建一个Node 结点，name 就是smith
		Node smith = new Node("smith");
		
		smith.pre = tom;
		smith.next = hsp;
		tom.next = smith;
		hsp.pre = smith;
		
		//让first再次指向jack
		first = jack;
		
		
		System.out.println("==从头到尾进行遍历==");
		while(true) {
			if(first == null) {
				break;//退出循环
			}
			System.out.println(first);
			first = first.next;
		}
		
		last = hsp;//让last重新指向最后一个结点
		//从尾到头进行遍历
		System.out.println("==从尾到头进行遍历==");
		while(true) {
			if(last == null) {
				break;//退出循环
			}
			System.out.println(last);
			last = last.pre;
		}
	}
}
//定义一个Node类，Node对象表示双向链表的一个节点
class Node{
	public Object item;//真正存放数据
	public Node next;//指向下一个节点
	public Node pre;
	public Node(Object name) {
		this.item = name;
	}
	
	public String toString() {
		return "Node name=" + item;
	}
}