package com.faikturan;

public class MovableRectangle implements Movable {
	private MovablePoint topLeft;
	private MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int x2, int y1, int y2, 
			int xSpeed, int ySpeed) {
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public void moveUp() {
	 topLeft.y -= topLeft.ySpeed;
	 bottomRight.y -= bottomRight.ySpeed;
	}

	@Override
	public void moveDown() {
		topLeft.y += topLeft.ySpeed;
		 bottomRight.y += bottomRight.ySpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub

	}

}
