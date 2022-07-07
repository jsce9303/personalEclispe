package sec06;

public class Anonymous1Demo {
	Bird e = new Bird() {											// Bird 'e' 는 Anonymous1Demo 클래스의 멤버 필드다
		public void move() {										// Bird 클래스의 move()메소드를 오버라이딩 한다.
			System.out.println("독수리가 날아온다.");
		}
		
		public void species() {
			System.out.println("이 독수리는 조류다.");
		}
		
		void sound() {													// Bird 클래스에는 없는 타입의 메소드이므로 Bird의 타입으로는 접근할 수 없다. 즉 출력불가
			System.out.println("휘익!");
		}
	};

	public static void main(String[] args) {
		Anonymous1Demo a = new Anonymous1Demo();
		a.e.move();														// 오버라이딩한 메소드를 호출한다.
		a.e.species();
	}

}
