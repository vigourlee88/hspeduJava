package com.hspedu.homework_;

import java.util.TreeSet;

@SuppressWarnings({"all"})
public class Homework05 {
	public static void main(String[] args) {
		/*
		 * HashSet的去重机制
		 * hashCode()+equals()
		 * 底层通过存入对象进行运算得到一个hash值，通过hash值得到对应的索引，
		 * 如果发现索引所在的位置(table)没有数据，就直接存放，
		 * 如果有数据就进行equals遍历比较(这里规则一般由程序员决定)
		 * 如果比较后，不相同，就加入。否则就不加入
		 * TreeSet去重机制
		 * 如果你传入一个Comparator匿名内部类
		 * 就会使用实现的compare去重，如果方法返回0，就认为是相同的元素/数据，就不添加
		 * 如果你没有传入一个一Comparator匿名内部对象，
		 * 则以你添加的对象实现的comparable接口的
		 * compareTo()方法去重。compareTo()比较的是内容
		 */
		TreeSet treeSet = new TreeSet();
		/*
		 * 分析源码
		 * add方法 因为TreeSet()构造器没有传入Comparator接口的匿名内部类
		 * 所以在底层 Comparable<? super K> k = (Comparable<? super K>)key;
		 * 即 把Person转换成Comparable类型
		 * 而Person没有实现Comparable接口
		 * 类型转换报错
		 */
		treeSet.add(new Person01());//报异常ClassCastException
		treeSet.add(new Person01());//报异常ClassCastException
		treeSet.add(new Person01());//报异常ClassCastException
		treeSet.add(new Person01());//报异常ClassCastException
		System.out.println(treeSet);
	}
}
/*
 * 解决  class Person implements Comparable{
 *         @Override
 *         public int compareTo(Object o){
 *          return 0;//返回0，认为是相同的元素
 *         }
 */
class Person01 implements Comparable{

	@Override
	public int compareTo(Object o) {

		return 0;
	}
	
}