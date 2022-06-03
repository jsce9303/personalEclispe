package sec08;

public class UpcastDemo {

	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		p = s; //p = (Person)s 와 동일
		p.whoami();
		System.out.println(s.number);
		
		Student s2 = (Student) p;
		//자식 클래스인 s는 부모 클래스p의 메소드도 쓸 수 있다11
		s.whoami();
		s.work();
	}
}
