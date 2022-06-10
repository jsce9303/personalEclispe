package programming.Forth;

class Child extends Parent {
	String name = "사도세자";
	
	Child() {
		super(); //부모의 필드는 오버라이딩 불가
		this.name = name;
	}
	
	void print() {
		System.out.println("나는 "+name+"이다.");
	}

}
