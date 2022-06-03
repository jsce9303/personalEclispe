package sec08;

class Vehicle{
	String name = "탈 것";
	
	void whoami() {
		System.out.println("나는 탈 것이다.");
	}
		static void move() {
			System.out.println("이동하다.");
		}
	}


class Car extends Vehicle {
	void whoami() {
		System.out.println("나는 자동차이다.");
	}
	
	static void move() {
		System.out.println("달리다.");
	}
}

public class OverTypeDemo {
	public static void main(String[] args) {
		Vehicle v = new Car();					// v의 속성은 Car의 것
		System.out.println(v.name);		// Vehicle타입의 name 필드에 접근한다 (필드와 정적메서드는 오버라이딩 불가)
		v.whoami();										// v의 실제 객체는 Car타입이므로 Car타입의 메서드 whoami()를 출력한다.
		v.move();											// move()는 정적메서드이기 때문에 부모객체 Vehicle의 move()로 호출한다. (필드와 정적메서드는 오버라이딩 불가)
	}

}
