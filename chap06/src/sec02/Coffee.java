package sec02;

public class Coffee {
	private void secret() {
		System.out.println("자식클래스는 물려받지 못하는 메서드");
	}
	
	protected void identity() {
		System.out.println("카페인 음료다");
	}
	
	public void taste() {
		System.out.println("씁쓸한 맛이 난다");
	}

}
