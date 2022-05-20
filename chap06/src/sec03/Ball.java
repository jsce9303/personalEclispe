package sec03;

class Ball extends Circle{
	private String color; //동일 클래스 내애세만 참조가능
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + " 공이다.");
	}
	
	@Override // 오버라이드 오류 감지
	public void findArea() { // 메서드 오버라이딩
		findRadius(); // 물려받은 것이므로 super없이 호출가능
		
		super.findArea();

		System.out.println("넓이는 4*(π*반지름*반지름)이다.");
	}
	
	public void findVolume() {
		System.out.println("부피는 4/3(π*반지름*반지름)이다.");
	}

}
