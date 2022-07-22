package Challenger;



abstract class Countable { 

	protected String name;
	protected int num;
	
	Countable(String name,int num){
		this.name=name;
		this.num=num;
	}
	
	abstract void count(); 
	
}

class Bird extends Countable{
	
	Bird(String name,int num) {
		super(name, num);
	}
	
	
	void fly() {
		System.out.println(num+ "마리 " + name + "가 날아간다.");
	}

	void count() {
		System.out.println(name + "가 "+ num  + "마리 있다.");
	}
	
}

class Tree extends Countable {

	Tree(String name,int num) {
		super(name, num);
	}
	
	void ripen() {
		System.out.println(num + "그루 " + name  + "에 열매가 잘 익었다.");
	}

	void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
	}
}


