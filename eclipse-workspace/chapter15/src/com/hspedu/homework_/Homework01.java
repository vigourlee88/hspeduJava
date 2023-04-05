package com.hspedu.homework_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Homework01 {
	public static void main(String[] args) {
		
	}
	
	@Test
	public void testList() {
		//这里我们给泛型T,指定类型是User
		DAO<User> dao = new DAO<>();
		dao.save("001", new User(1,10,"jack"));
		dao.save("002", new User(2,18,"king"));
		dao.save("003", new User(3,38,"smith"));
		
		List<User> list = dao.list();
		
		System.out.println("list=" + list);
		
		dao.update("003", new User(3,58,"milan"));
		dao.delete("001");//删除
		System.out.println("====修改后====");
		//重新获取
		list = dao.list();
		System.out.println("list=" + list);
		
		System.out.println("id=003 " + dao.get("003"));
	}
	
	
}
/*
 * 思路分析
 * 1.定义一个User对象
 * 2.定义 泛型类 DAO
 */
class DAO<T>{
	private Map<String,T> map = new HashMap<>();
	
	public T get(String id) {
		//保存T类型的对象到Map 成员变量中
		return map.get(id);
	}
	
	public void save(String id,T entity) {
		//保存T类型的对象到Map成员变量中
		map.put(id, entity);
	}
	
	public void update(String id,T entity) {
		//替换map中key为id的内容，改为entity对象
		map.put(id, entity);
	}
	
	public List<T> list(){
		//返回map中存放的所有T对象
		//遍历map,将map的所有value(T entity)封装到ArrayList返回即可
		//创建ArrayList对象
		List list = new ArrayList();
		//遍历map,使用keySet遍历
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			//list.add(map.get(key));
			//map.get(key) 返回的就是User对象->放入ArrayList中
			list.add(get(key));	
		}
		return list;
		
	}
	
	public void delete(String id) {
		//删除指定id对象
		map.remove(id);
	}
}
class User{
	private int id;
	private int age;
	private String name;
	public User(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	
}