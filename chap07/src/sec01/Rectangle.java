package sec01;

class Rectangle extends Shape {
	int width , height;
	
	public Rectangle(int radius,int height) {
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
	
	public double finrArea() {
		return width * height;
	}
}