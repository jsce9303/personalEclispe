package sec06;

public class One1 extends One {
	void print() {		// 자식클래스이기 때문에 별도의 객체를 생성하지 않고 모두 접근 가능
		System.out.println(roommate);
		System.out.println(child);
		System.out.println(anybody);
	}
}