package com.hspedu.draw_;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

//演示如何在面板上画出圆形
//JFrame对应一个窗口,可以理解成是一个画框
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{
	//定义一个面板
	private MyPanel mp = null;
	public static void main(String[] args) {
		new DrawCircle();
		System.out.println("退出程序");
	}
	
	public DrawCircle() {//构造器
		//初始化面板
		mp = new MyPanel();
		//把面板放入到窗口(画框)
		this.add(mp);
		//设置窗口的大小  width,
		this.setSize(400,300);
		//当点击窗口的小x,程序完全退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);//可以显示，看到
	}
}
//1.先定义一个MyPanel，继承JPanel类，画图形，就在面板上画
class MyPanel extends JPanel{
	
	//说明
	//1.MyPanel对象就是一个画板
	//2.Graphics g 把g 理解成一支画笔
	//3.Graphics 提供了很多绘图的方法
	//Graphics g
	@Override
	public void paint(Graphics g) {//绘图方法
		super.paint(g);//调用父类方法，完成初始化
		//System.out.println("paint 方法被调用");
		//画出一个图形
		//g.drawOval(10,10,100,100);
		//g.drawOval(0,0,100,100);
		
		//演示绘制不同的图形
		//画直线
		//g.drawLine(10, 10, 100, 100);//起始点 和 终点
		//画矩形边框
		//g.drawRect(10, 10, 100, 100);
		//填充矩形
		//设置画笔的颜色
		//g.setColor(Color.blue);
		//g.fillRect(10,10,100,100);
		//填充椭圆
		//g.setColor(Color.red);
		//g.fillOval(10, 10, 100, 100);
		//画图片
		//1.获取图片资源，/  表示在该项目的根目录去获取
		//Image image =Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/pg.png"));
		//g.drawImage(image, 10, 10, 778, 516, this);
		//画字符串
		//给画笔设置颜色和字体
		g.setColor(Color.red);
		g.setFont(new Font("隶书",Font.BOLD,50));
		//这里设置的100,100是"北京你好"的左下角
		g.drawString("北京你好", 100, 100);
		
	}
}