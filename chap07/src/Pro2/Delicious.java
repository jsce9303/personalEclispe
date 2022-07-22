package Pro2;

interface Edible{
	void eat();
}

interface Sweetable {
	void sweet();
}


public interface Delicious extends Edible, Sweetable {
	//2개의 인터페이스를 모두 수용가능한 통합 인터페이스 = 2개를 모두 상속한 자식 인터페이스
}
