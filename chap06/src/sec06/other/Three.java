package sec06.other;
import sec06.One;

public class Three {
	void print() {
		One o = new One();
		// System.out.println(o.roommate);
		System.out.println(o.anybody); // 자식클래스도 아니고 다른 패키지라서 public 멤버만 접근 가능
	}
}
