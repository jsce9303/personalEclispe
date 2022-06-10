package programming.First;

class ColoredCircle extends Circle {
	private String color;
	
	public ColoredCircle(int radius,String color) {
		this.color = color;
		this.radius = radius;
	}	
	
	public void Circle(int radius) {
		super.Circle(radius);
	}
	
	public void show() {
		System.out.println("반지름이 " + radius*2 + "인 " + color +" 원이다.");
		
	}

}
