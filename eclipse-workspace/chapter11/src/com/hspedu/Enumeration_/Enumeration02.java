package com.hspedu.Enumeration_;

public class Enumeration02 {
	public static void main(String[] args) {
		System.out.println(Season02.AUTUMN);
		System.out.println(Season02.SPRING);
		System.out.println(Season02.WINNER);
		System.out.println(Season02.SUMMER);
	}

}
//演示自定义枚举实现
class Season02{
	private String name;
	private String desc;
	
	//定义了4个对象，多个属性
	//public 别人可以访问 static希望直接可以使用
	public final static Season02 SPRING = new Season02("春天","温暖");
	public final static Season02 WINNER = new Season02("冬天","寒冷");
	public final static Season02 SUMMER = new Season02("夏天","炎热");
	public final static Season02 AUTUMN = new Season02("秋天","凉爽");
	
	//1.将构造器私有化，目的 防止直接 new
	//2.去掉setXxx方法，只能读，防止属性被修改
	//3.在Season内部，直接创建固定的对象
	//对枚举对象/属性使用final static 共同修饰，实现底层优化
	//4.优化，可以加入final 修饰
	//5.枚举对象名通常使用全部大写，常量的命名规范
	//6.枚举对象根据需要，也可以有多个属性
	private Season02(String name, String desc) {
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
		return "Season01 [name=" + name + ", desc=" + desc + "]";
	}
	
}