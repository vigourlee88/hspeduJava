package com.hspedu.set_;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

@SuppressWarnings("all")
public class TreeSet_ {
	public static void main(String[] args) {
		//1.当我们使用无参构造器，创建TreeSet时，仍然是无序的
		//2.老师希望添加的元素，按照字符串大小排序
		//3.使用TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
		// 并指定排序规则
		
		//TreeSet treeSet = new TreeSet();
		TreeSet treeSet = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//下面调用String的compareTo方法进行字符串大小比较
				//如果要求加入的元素，按照长度大小排序
				//return ((String) o1).compareTo((String) o2);//先进行向下转型
				return ((String) o1).length()-((String) o2).length();//先进行向下转型
			}
			
		});
		//添加数据
		treeSet.add("jack");
		treeSet.add("tom");//3
		treeSet.add("sp");
		treeSet.add("a");
		//treeSet.add("abc");//加不进去，长度为3
		
		System.out.println("treeSet=" + treeSet);
		
		/*底层源码解析
		  1.构造器把传入的比较器对象，赋给了TreeSet的底层的 TreeMap的属性
		  public TreeSet(Comparator<? super E> comparator) {
            this(new TreeMap<>(comparator));
          }
          
          public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
          }
         
         2.在调用treeSet.add("tom"),在底层会执行到
         
         if (cpr != null) {//cpr就是我们的匿名内部类(对象)
            do {
                parent = t;
                //动态绑定到我们的匿名内部类(对象)
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else {//如果相等，即返回0，这个key就没有加入
                    V oldValue = t.value;
                    if (replaceOld || oldValue == null) {
                        t.value = value;
                    }
                    return oldValue;
                }
            } while (t != null);
        } 
		 */
	}
	
}
