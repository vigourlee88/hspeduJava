package com.hspedu.tankgame4;

import java.util.Vector;

//敌人的坦克
public class EnemyTank extends Tank implements Runnable {
	// 在敌人坦克类，使用Vector 保存多个Shot
	Vector<Shot> shots = new Vector<>();
	boolean isLive = true;

	public EnemyTank(int x, int y) {
		super(x, y);

	}

	@Override
	public void run() {
		while (true) {
			
			//敌人的坦克是活着的，并且只有一颗子弹
			//我们判断如果shots.size()=0,shots.size() < 10控制打几颗子弹
			//创建一颗子弹，放入shots集合,并启动
			if(isLive && shots.size() == 0) {
				
				Shot s = null;
				//判断坦克的方向，创建对应的子弹
				switch(getDirect()) {
					case 0:
						s = new Shot(getX() + 20,getY(),0);
						break;
					case 1:
						s = new Shot(getX() + 60,getY() + 20,1);
						break;
					case 2:
						s = new Shot(getX() + 20,getY() + 60,2);
						break;
					case 3:
						s = new Shot(getX() ,getY() + 20,3);
						break;
				}
				shots.add(s);
				//启动
				new Thread(s).start();
			}
			// 根据坦克的方向来继续移动
			switch (getDirect()) {
			case 0:// 向上
					// 让坦克保持一个方向，走30步
				for (int i = 0; i < 30; i++) {
					if (getY() > 0) {
						moveUp();
					}

					// 休眠50毫秒
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			case 1:// 向右
				for (int i = 0; i < 30; i++) {
					if ((getX() + 60) < 1000) {
						moveRight();
					}
					// 休眠50毫秒
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			case 2:// 向下
				for (int i = 0; i < 30; i++) {
					if ((getY() + 60) < 750) {
						moveDown();
					}
					// 休眠50毫秒
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:// 向左
				for (int i = 0; i < 30; i++) {
					if(getX() > 0) {
						moveLeft();
					}
					
					// 休眠50毫秒
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			}

			// 然后随机的改变坦克方向0-3
			setDirect((int) (Math.random() * 4));
			// 写并发 程序，一定要考虑清楚，该程序什么时候结束
			if (!isLive) {
				break;// 退出线程
			}
		}
	}
}
