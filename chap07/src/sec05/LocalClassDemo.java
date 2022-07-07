package sec05;

public class LocalClassDemo {							//외부 클래스
	private String s1 = "외부";
	
	void method() {													// 외부 클래스의 메소드
		int x = 1;															// x는 외부클래스 메소드의 필드 및 멤버
		class LocalClass {											// 지역 클래스 & 중첩클래스
			String s2 = "내부";
			String s3 = s1;												// 외부 클래스의 private멤버도 접근 할 수 있다.
			
			public void show() {
				System.out.println("지역 클래스");
				//x= 2;														// 외부 클래스의 메소드의 필드 및 멤버는 사실상 final이므로 수정 불가
			}
		}
		
		LocalClass lc = new LocalClass();				// 생성자를 만든다
		System.out.println(lc.s2);								// lc.s2는 지역클래스의 멤버 s2를 지칭한다
		lc.show();															// lc.show()는 외부클래스의 메소드 내부의 void show를 의미하며 "지역 클래스"를 출력한다.
	}

	public static void main(String[] args) {
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.method();													// 변수 lcd 는 최종적으로 외부클래스의 메소드를 지칭하며 해당 메소드 안의 클래스의 메소드를 호출한다.
	}

}
