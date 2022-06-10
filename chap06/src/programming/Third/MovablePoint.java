package programming.Third;

class MovablePoint extends Point {
	private int xSpeed, ySpeed;
	MovablePoint(int x, int y,int xSpeed, int ySpeed){
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	int getxSpeed() {
		return xSpeed;
	}
	int getySpeed() {
		return ySpeed;
	}
	void setxSpeed(int xSpeed) {
		this. xSpeed = xSpeed;
	}
	void setySpeed(int ySpeed) {
		this. ySpeed = ySpeed;
	}
	
	public String toString() {
        return "Point [x=" + getx() + ", y=" +gety() + ", xSpeed= "+xSpeed +", ySpeed= " + ySpeed+ "]";
    }
}
