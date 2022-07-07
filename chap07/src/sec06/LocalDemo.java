package sec06;

public class LocalDemo {
	public static void main(String[] args) {
		class Eagle extends Bird {										// 지역클래스 & Bird 클래스를 상속한 자식 클래스 Eagle
			public void move() {											// Bird 클래스의 move() 메소드를 오버라이딩함
				System.out.println("독수리가 난다.");
			}
		}
				
		Bird e = new Eagle();												//  e 는 main() 메소드의 지역변수
		e.move();
		e.species();
	}
}