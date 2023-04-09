package com.hspedu.tankgame3;

import com.hspedu.tankgame3.Tank;

//自己的坦克
public class Hero  extends Tank{
	//定义一个Shot对象,代表一个射击(线程)
	Shot shot = null;

	public Hero(int x, int y) {
		super(x, y);
	}
	//射击
	public void shotEnemyTank() {
		//创建Shot对象，根据当前坦克的位置，方向来创建Shot
		switch(getDirect()) {//得到Hero对象的方向
			case 0://向上
				shot = new Shot(getX()+20,getY(),0);//面向对象
				break;
			case 1://向右
				shot = new Shot(getX()+60,getY()+20,1);
				break;
			case 2://向下
				shot = new Shot(getX()+20,getY()+60,2);
				break;
			case 3://向左
				shot = new Shot(getX(),getY() + 20,3);
				break;		
		}
		//启动Shot线程
		//因为Shot是实现Runnable接口的
		//按下J键,响应在MyPanel来监听
		new Thread(shot).start();
	}
}
