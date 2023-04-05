package com.hspedu.tankgame2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

//为了监听 键盘事件 实现KeyListener
public class MyPanel extends JPanel implements KeyListener{
	//定义我的坦克
	Hero hero = null;
	
	//定义敌人的坦克,放入到Vector集合中
	Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
	public MyPanel() {
		hero = new Hero(100,100);//初始化自己的坦克
		hero.setSpeed(5);//在创建坦克的时候，设置坦克的速度
		
		//构造器中初始化敌人的坦克
		for(int i = 0;i < enemyTankSize;i++) {
			//创建一个敌人的坦克
			EnemyTank enemyTank = new EnemyTank((100* (i + 1)),0);
			//设置方向，向下
			enemyTank.setDirect(2);
			//加入
			enemyTanks.add(enemyTank);
		}
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//填充矩形边框，默认黑色
		g.fillRect(0, 0, 1000, 750);
		
		//画出自己的坦克-封装方法
		//drawTank(hero.getX(), hero.getY(), g, 3, 1);//向右
		drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);//getDirect
		
		//画出敌人的坦克，遍历Vector,必须使用enemyTanks.size(),有可能被打掉销毁
		for(int i = 0;i < enemyTanks.size();i++) {
			//取出坦克
			EnemyTank enemyTank = enemyTanks.get(i);
			drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);//g 是画笔
			
		}
		
	}
	//编写方法，画出坦克
	/**
	 * 
	 * @param x 坦克的左上角x坐标
	 * @param y 坦克的左上角y坐标
	 * @param g 画笔
	 * @param direct 坦克方向(上下左右)
	 * @param type 坦克类型
	 */
	public void drawTank(int x,int y,Graphics g, int direct,int type) {
		
		//根据不同类型的坦克，设置不同颜色
		switch(type) {
			case 0://我们的坦克
				g.setColor(Color.cyan);
				break;
			case 1://敌人的坦克
				g.setColor(Color.yellow);
				break;
		}
		
		//根据坦克的方向，来绘制对应形状的坦克
		//direct 表方向(0:向上1:向右2:向下3:向左)
		switch(direct) {
			case 0://表向上
				//绘制一个填充有当前颜色的3-D高亮矩形
				g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
				g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边的轮子
				g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出中间的坦克盖子
				g.fillOval(x + 10, y + 20, 20, 20);//画出圆盖
				g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
				break;
			case 1://表向右
				
				g.fill3DRect(x, y, 60, 10, false);//画出坦克上边边的轮子
				g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边的轮子
				g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出中间的坦克盖子
				g.fillOval(x + 20, y + 10, 20, 20);//画出圆盖
				g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
				break;
			case 2://表向下
				
				g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
				g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边的轮子
				g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出中间的坦克盖子
				g.fillOval(x + 10, y + 20, 20, 20);//画出圆盖
				g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
				break;
			case 3://表向左
				
				g.fill3DRect(x, y, 60, 10, false);//画出坦克上边边的轮子
				g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边的轮子
				g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出中间的坦克盖子
				g.fillOval(x + 20, y + 10, 20, 20);//画出圆盖
				g.drawLine(x + 30, y + 20, x , y + 20);//画出炮筒
				break;
			default:
				System.out.println("暂时没有处理");
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
			
	}
	//处理 wdsa 键按下的情况
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {//按下w键，向上移动
			System.out.println("xx");
			//改变坦克的方向
			hero.setDirect(0);
			//修改坦克的坐标 y -=1;y是private,写到方法中
			//hero.setY(hero.getY()-1);
			hero.moveUp();
			
		}else if(e.getKeyCode() == KeyEvent.VK_D) {//按下d键，向右移动
			hero.setDirect(1);
			hero.moveRight();
			
		}else if(e.getKeyCode() == KeyEvent.VK_S) {//按下s键,向下移动
			hero.setDirect(2);
			hero.moveDown();
			
		}else if(e.getKeyCode() == KeyEvent.VK_A) {//按下a键，向左移动
			hero.setDirect(3);
			hero.moveLeft();
			
		}
		//让面板重绘
		this.repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
}
