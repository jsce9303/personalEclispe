package Pro4;


interface Talkable {
 	void talk();
}


	
class Korean implements Talkable{
	public void talk() {
		System.out.println("안녕하세요.");
	}
}

class American implements Talkable{
	public void talk() {
		System.out.println("Hello");
	}
}


public class TalkableTest { //테스트 프로그램
	static void speak(Talkable a) {
		a.talk();
	}
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}

}
