package com.hspedu.houserent.service;

import com.hspedu.houserent.domian.House;

/**
 * HouseService.java 业务层
 * 定义House[] 保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作(增删改查)
 *
 */
public class HouseService {
	
	private House[] houses;//保存House对象
	private int houseNums = 1;//记录当前有多少个房屋信息
	private int idCounter = 1;//记录当前的id增长到哪个值了
	
	//构造器
	public HouseService(int size) {
		houses = new House[size];//当创建HouseService对象时，指定数组大小
		//为了配合测试列表信息，初始化一个House对象
		houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");
	}
	
	//find方法 返回House对象或null
	public House findById(int findId) {
		
		//遍历数组
		for (int i = 0; i < houseNums; i++) {
			if(findId == houses[i].getId()) {
				return houses[i];
			}
		}
		return null;
	}
	
	//del方法 删除一个房屋信息
	public boolean del(int delId) {
		//应当先找到要 删除的房屋信息对应的下标
		//一定要搞清楚，下标和房屋的编号不是一回事
		int index = -1;
		for (int i = 0; i < houseNums; i++) {
			if(delId == houses[i].getId()) {//要删除的房屋(id),是数组下标为i的元素
				index = i;//使用index 记录i
				
			}
		}
		
		if(index == -1) {//说明delId在数组中不存在
			return false;
		}
		//如果找到，思路分析
		//
		for (int i = 0; i < houseNums-1; i++) {
			houses[i] = houses[i+1];
			
		}
		houses[--houseNums] = null;
	  //  houses[houseNums -1] = null;//把当前存在的房屋信息的最后一个 设置null
	  //  houseNums--;//少一个
	    return true;
	}
	
	
	
	//add方法 添加新对象，返回boolean
	public boolean add(House newHouse) {
		//判断是否还可以继续添加，暂时不考虑扩容问题
		
		if(houseNums == houses.length) {//不能再添加
			System.out.println("数组已满,不能再添加了...");
			return false;
		}
		//把newHouse对象加入到houses的最后
		houses[houseNums++] = newHouse;//后++
		//houseNums++;
		//程序员需要设计一个id自增长的机制,更新newHouse的id
		//idCounter++;
		newHouse.setId(++idCounter);
		return true;
	}
	
	//list方法，返回house
	public House[] list() {
		return houses;
	}

}
