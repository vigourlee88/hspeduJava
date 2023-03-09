package com.hspedu.Enumeration_;

public class Enumeration01 {
	public static void main(String[] args) {
		Season spring = new Season("春天","温暖");
		Season winter = new Season("冬天","寒冷");
		Season summer = new Season("夏天","炎热");
		Season autumn = new Season("秋天","凉爽");
		//对于季节而言，它的对象(具体值)，是固定的，不会有变更
		Season hongtian = new Season("红天","~~~~");
		//不能体现是固定的对象
		//枚举类 一个一个列举 即把具体的对象一个一个列举出来的类
	}
}
class Season{
	private String name;
	private String desc;
	public Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}