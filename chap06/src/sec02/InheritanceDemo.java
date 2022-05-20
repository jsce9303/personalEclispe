package sec02;

public class InheritanceDemo {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Latte c2 = new Latte("뜨거운");
		
		System.out.println("커피 :");
		c1.identity();
		c1.taste();

		System.out.println("\n카페라떼 :");
		c2.identity();
		c2.findHot();
		c2.addtaste();
	}

}
