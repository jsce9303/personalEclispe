package sec06;

public class Anonymous3Demo {
	public static void main(String[] args) {
		Bird b = new Bird() {									// 익명 , 상속도 아예 안쓴 순수 부모클래스 Bird의 객체를 생성함.
		};
		b.move();
		b.species();
		//b.sound();													// sound() 메서드는 없기 때문에 출력할 수 없다.
	}
}