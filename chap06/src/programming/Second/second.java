package programming.Second;

public class second {
	public static void main(String[] args) {
		Person[] persons = {new Person("길동이",22), new Student("황진이",23,100), new ForeignStudnet("Amy",30,200,"U.S.A")};
	
	for(Person g : persons)
		g.show();
	}
}