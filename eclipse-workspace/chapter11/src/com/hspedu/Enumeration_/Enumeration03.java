package com.hspedu.Enumeration_;

public class Enumeration03 {
	public static void main(String[] args) {
		System.out.println(Season03.AUTUMN);
		System.out.println(Season03.SPRING);
		System.out.println(Season03.WINNER);
		System.out.println(Season03.SUMMER);
	}

}
//演示使用enum关键字实现枚举
enum Season03{
	
	
	//定义了4个对象，多个属性
	
//	public final static Season03 SPRING = new Season03("春天","温暖");
//	public final static Season03 WINNER = new Season03("冬天","寒冷");
//	public final static Season03 SUMMER = new Season03("夏天","炎热");
//	public final static Season03 AUTUMN = new Season03("秋天","凉爽");
    //如果使用了enum来实现枚举类
	//1.使用关键字 enum 替代class
	//2.public final static Season03 SPRING = new Season03("春天","温暖");
	//SPRING("春天","温暖");解读 常量名(实参列表)
	//3.如果有多个常量，使用,间隔
	//4.使用enum来实现枚举，要求将定义的常量对象，写在前面
	//5.如果使用的是无参构造器，创建常量对象，则可以省略()
	SPRING("春天","温暖"),
	WINNER("冬天","寒冷"),
	SUMMER("夏天","炎热"),
	AUTUMN("秋天","凉爽")/*,WHAT*/;
	private String name;
	private String desc;
	
	private Season03() {//无参构造器
		
	}	
	private Season03(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return "Season03 [name=" + name + ", desc=" + desc + "]";
	}
	
}