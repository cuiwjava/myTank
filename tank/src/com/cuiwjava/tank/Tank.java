package com.cuiwjava.tank;

import java.awt.Color;
import java.awt.Graphics;

public class Tank {

	private int x, y;
	Dir dir = Dir.DOWN;
	private static final int SPEED = 10;
	private boolean moving = false;
	
	private TankFrame tf = null;
	
	public Tank(int x, int y, Dir dir, TankFrame tf) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.tf = tf;
	}


	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.yellow);
		g.fillRect(x, y, 50, 50);
		
		move();
	}
	
	private void move() {
		if(!moving) return;
		
		switch(dir) {
			case LEFT:
				x-=SPEED;
				break;
			case UP:
				y-=SPEED;
				break;
			case RIGHT:
				x+=SPEED;
				break;
			case DOWN:
				y+=SPEED;
				break;
		}
	}
	
	public void fire() {
		tf.bullets.add(new Bullet(this.x, this.y, this.dir,this.tf));
	}
	
	public Dir getDir() {
		return dir;
	}

	public void setDir(Dir dir) {
		this.dir = dir;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	
}
