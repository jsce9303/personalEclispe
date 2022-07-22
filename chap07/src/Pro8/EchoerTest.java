package Pro8;

import java.util.Scanner;

abstract class Echoer {
	
	public Echoer() {
	}
	
	void start() {
		System.out.println("시작합니다.");
	}
	
	abstract void echo() ;
	
	void stop() {
		System.out.println("종료합니다.");
	}
}


public class EchoerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Echoer e = new Echoer() {
			@Override
			void echo() {
				String t;
				do {
					t = sc.nextLine();
					System.out.println(t);
				}while(t != "");
				
			}
		};
		e.start();
		e.echo();
		e.stop();
	}

}
