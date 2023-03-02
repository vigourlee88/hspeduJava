package com.hspedu.homework_;

public class LabeledPoint extends Point{
     //特有属性
	private String label;
	 //方法
	public LabeledPoint( String label,double x, double y) {
		super(x, y);
		this.label = label;
	}
	
}
