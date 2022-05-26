package sec06.other;
import sec06.One;

public class One2 extends One {
	void print() {
		System.out.println(child); // 다른패키지 소속이나 자식클래스이기 때문에 public 및 protected멤버에만 접근 가능 11
		System.out.println(anybody);//깃테스트
	}
}
