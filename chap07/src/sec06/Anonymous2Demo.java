package sec06;

public class Anonymous2Demo {
	public static void main(String[] args) {
		Bird b = new Bird() {												// b 는 지역변수
			public void move() {											// Bird 클래스의 move() 메소드를 오버라이딩 한다.
				System.out.println("독수리가 날아간다.");		// Bird 클래스의 자식클래스(지역클래스)인 Eagle을 익명클래스로 바꿈
			}
			
			public void species() {
				System.out.println("이 독수리는 조류에 속한다.");
			}
		};
		b.move();
		b.species();
	}
}