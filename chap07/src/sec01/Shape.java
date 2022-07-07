package sec01;

abstract class Shape {	//추상클래스
	double	pi = 3.14;
	
	abstract void draw();	//본체가 없음
	
	public double findArea() {	//구현메서드
		return 0.0;
	}
}