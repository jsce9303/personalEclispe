package sec06;

public class Two {
	void print() {	
		One o = new One(); //자식클래스가 아닌 별도의 클래스기 때문에 객체를 만들어야 모두 접근가능함
		System.out.println(o.roommate);
		System.out.println(o.child);
		System.out.println(o.anybody);
	}
}