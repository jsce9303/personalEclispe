package programming.Third;

class Point {
	private int x,y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	int getx() {
		return x;
	}
	int gety() {
		return y;
	}
	void setx(int x) {
		this. x = x;
	}
	void sety(int y) {
		this. y = y;
	}
	
	public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
