package sec02;

public class Latte extends Coffee{
	private String hot; //동일 클래스 내애세만 참조가능
	
	public Latte(String hot) {
		this.hot = hot;
	}
	
	public void findHot() {
		System.out.println(hot + " 음료다.");
	}
	
	public void addtaste() {
		System.out.println("우유가 들어간 커피의 종류다");
	}
}
