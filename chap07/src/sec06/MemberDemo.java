package sec06;

public class MemberDemo {
	class Eagle extends Bird {								// 외부클래스 MemberDemo의 멤버 클래스 및 내부클래스 및 중첩클래스 및  Bird를 부모로 하는 자식클래스 Eagle
		public void move() {									// Bird 클래스의 메소드 move()를 오버라이딩 한다.
			System.out.println("독수리가 난다");
		}
		
		public void sound() {									// 자식클래스인 Eagle에서 추가한 새 메소드 sound()
			System.out.println("휘익!");
		}
	}
	
	Eagle e = new Eagle();									// 외부클래스 MemberDemo의 멤버 필드

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();	// 객체 m으로 생성자를 만든다.
		m.e.move();													// MemberDemo 클래스의 객체 'm'의 멤버 필드 'e' 객체의 move() 호출
		m.e.sound();													// MemberDemo 클래스의 객체 'm'의 멤버 필드 'e' 객체의 sound() 호출
	}
}