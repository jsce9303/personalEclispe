package sec05;

public class MemberClassDemo {			//외부 클래스
		private String secret = "비공개";
		String s = "외부1";
		
		class MemberClass{							//내부 클래스 & 중첩클래스
			String s = "내부1";
		
		
		public void show1() {
			System.out.println("내부 클래스");
			System.out.println(secret);			//외부 클래스의 private 멤버도 접근할 수 있다.
			
			System.out.println(s);					//내부 클래스의 멤버 s를 의미한다.
			
			System.out.println(MemberClassDemo.this.s);	//외부클래스의 필드인 5행의 멤버 s를 의미한다.
		}
	}
		
	public static void main(String[] args) {
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();	//MemberClassDemo 클래스의 멤버인 MemberClass를 의미한다.
																																//내부 클래스를 생성한다.
		System.out.println(m1.s);
		m1.show1();
	}

}
