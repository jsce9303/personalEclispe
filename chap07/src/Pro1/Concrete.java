package Pro1;

public class Concrete extends Abstract {	//추상클래스를 상속한 구현클래스 Concrete
	int j;											//구현 클래스의 필드 j
	
	public Concrete(int i, int j) {
		this.i=i;
		this.j=j;
	}

	void show() {
		System.out.println(" i = " + i  + ", " + "j = "+j);
	}

	}


