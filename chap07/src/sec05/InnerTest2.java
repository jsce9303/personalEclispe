package sec05;

public class InnerTest2 {
	
	class InstanceInner {
						int iiv = 100;
						final static int isv = 200;						// 인스턴스 클래스 내부에서 static 변수 선언
						final static int CONST = 300;				//final 상수는 선언가능
	}
	static class StaticInner {
						int siv = 300;
						static int cv = 400;									//static 클래스내부의 static 변수선언 가능
	}
	InstanceInner iv = new InstanceInner();				//인스턴스멤버끼리는 접근가능
	static StaticInner cv = new StaticInner ();			//스태틱멤버끼리 접근가능
	
	static void staticMethod() {										//스태틱 멤버는 인스턴스 멤버 접근가능
		//InstanceInner iobj1 = new InstanceInner(); //이너 인스턴스 클래스 직접접근 불가
		StaticInner sobj1 = new StaticInner();
		
		InnerTest2 oobj1 = new InnerTest2();				// 인스턴스 클래스는 외부 클래스를 먼저 생성해야 접근 가능
		InstanceInner iobj2 = oobj1.new InstanceInner(); // 외부 클래스 참조변수를 prefix(접두사)로 붙이면 접근가능
	}
	void instanceMethod () {											// 인스턴스 메서드에서는 인스턴스멤버와 스태틱멤버 모두 접근가능
		InstanceInner iobj3 = new InstanceInner();	
		StaticInner sobj2 = new StaticInner();				//외부 클래스 참조변수를prefix(접두사)로 붙이면 접근가능
		//LocalInner Iv = new LocalInner();					//로컬 내부클래스는 외부에서 접근 불가능
	}
	void t1Method () {														// 메서드내에서 클래스 포함 가능
		class LocalInner {
							int iv = 500;
		}
		LocalInner Iv1 = new LocalInner();
	}
	public static void main(String args[]) {
		System.out.println("static cv(static 클래스의 것)  = " + StaticInner.cv);
		System.out.println("InstanceInner.CONST(이너클래스 final) = " + InstanceInner.CONST);
		System.out.println("InstanceInner.isv(이너클래스 static) = " + InstanceInner.isv);
		
		System.out.println(" ");
		InnerTest2 itiv1 = new InnerTest2();
		InstanceInner iiv1 = itiv1.new InstanceInner();
		System.out.println("iiv1.iiv = " + iiv1.iiv);
		System.out.println("iiv1.isv = " + iiv1.isv);
		System.out.println("iiv1.CONST = "+ iiv1.CONST);
		
		System.out.println("static cv = " +StaticInner.cv);	// 쌩으로 정적멤버 클래스의 필드를 불러온다
		
		//System.out.println("static iv = " + StaticInner.iv);	// 정적멤버 클래스에 없는 필드라서 불러 올 수 없다.
		//StaticInner siv1 = itiv1.new StaticInner();					// 정적 멤버 클래스는 생성자를 만들 수 없다.
		//System.out.println("static iv = " + siv1.iv);					// 변수 iv는 정적멤버 클래스의 변수가 아니기 때문에 불러올 수 없다.
		//System.out.println("static iv = " + siv1.siv);
	}

}
