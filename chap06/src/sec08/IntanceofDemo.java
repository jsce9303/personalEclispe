package sec08;

public class IntanceofDemo {
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		
		System.out.println(s instanceof Person);		// s가 Person의 자식타입이므로 true
		System.out.println(s instanceof Student);		// s가 Student 타입이므로 true이다.
		System.out.println(p instanceof Student);		//p가 Student 타입도 아니고 Student의 자식타입도 아니므로 false이다.
		
		downcast(s);
	}

		static void downcast(Person p) { 				// 인수로 Person 타입 혹은 Person의 자식 타입을 받을 수 있다.
			if(p instanceof Student) {
				Student s = (Student) p;						// p의 실제 타입이 Student 타입이므로 강제 타입변환할 수 있다.
				System.out.println("ok, 하향 타입 변환");
			}
		}
}
