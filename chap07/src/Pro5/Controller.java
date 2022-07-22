package Pro5;

public abstract class Controller {	//추상클래스
	boolean power;
	
	public Controller(boolean power) {
		this.power=power;
	}
	
	void show() {
		if(power == true)
			System.out.println(getName() + "이(가) 켜졌습니다.");
		else
			System.out.println(getName() + "이(가) 꺼졌습니다.");
	}
	
	abstract String getName();
}

class Television extends Controller {
	public Television(boolean power) {
		super(power);
	}
	
	public String getName() {
		return "Television";
	}
}
	

class Radio extends Controller {
	public Radio(boolean power) {
		super(power);
	}
	
	public String getName() {
		return "Radio";
	}
}