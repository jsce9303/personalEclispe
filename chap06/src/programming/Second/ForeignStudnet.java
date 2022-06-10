package programming.Second;

class ForeignStudnet extends Student {
	protected String nation;
	
	ForeignStudnet(String name, int age, int num,String nation){
		super(name, age,num);
		this.nation=nation;
	}
	void show(){
		System.out.println("외국학생[이름 : "+name+", 나이 : "+ age+", 학번 : "+num+", 국적 : " + nation +"]");
	}
}
