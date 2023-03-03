package com.hspedu.houserent.domian;

/**
 * House的对象表示一个房屋信息
 *
 */
public class House {
	//属性
	//编号 房主 电话 地址 月租 状态(已出租/未出租)
	private int id;
	private String name;
	private String phone;
	private String address;
	private double rent;
	private String state;
	//构造器和setter,getter
	public House(int id, String name, String phone, String address, double rent, String state) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.rent = rent;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//为了方便的输出对象信息，默认调用toString(),我们实现toString()
	@Override
	public String toString() {
		return id + 
			"\t\t" + name + 
			"\t\t" + phone +
			"\t\t" + address +
			"\t\t" + rent+ 
			"\t\t" + state ;
	}
}
