package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Map_ {
	public static void main(String[] args) {
		//Map接口 实现类的特点 使用实现类HashMap
		//1.Map和Collection并列存在，用于保存具有映射关系的数据:双列元素
		//2.Map中的key 和value可以是引用类型的数据，会封装到HashMap$Node对象中
		//3.Map中的key不允许重复，原因和HashSet一样
		//4.Map中的value 可以重复
		//5.Map中的key 可以为null,但只能有一个，value也可以为null,可多个
		//6.常用String类作为Map的key，Object都可以为key
		Map map = new HashMap();
		map.put("no1", "韩顺平");//k-v
		map.put("no2", "张无忌");//k-v
		map.put("no1", "张三丰");//当有相同的k,就等价于替换
		map.put("no3", "张三丰");
		map.put(null,null);
		map.put(null,"abc");//等价替换
		map.put("no4",null);//等价替换
		map.put("no5",null);//等价替换
		map.put(1,"张敏");
		map.put(new Object(),"金毛狮王");
		//通过get方法，传入key,会返回对应的value
		System.out.println(map.get("no2"));
		
		System.out.println("map=" + map);
	}
}
