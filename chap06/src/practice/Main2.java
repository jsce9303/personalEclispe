package practice;
import java.util.*;
public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfStudents = 0;
		int[] scores;
		
		System.out.println("학생의 수 ?");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for(int i = 0; i < numOfStudents; i++) {
			scores[i] = in.nextInt();
		}				
		
		System.out.println(numOfStudents +  "명의 학생 성적은 다음과 같습니다.");
		for (int x : scores) {
			System.out.print(x + " "); //for each 구문
		}
		
		for (int i = 0; i < scores.length; i++) {
		if(scores[i] >= 90)
			System.out.println("\n" +(i+1) +"번 학생의 등급은 A 입니다.");
		else if (scores[i] >=80)
			System.out.println((i+1) +"번 학생의 등급은 B 입니다.");
		else if (scores[i] >=70)
			System.out.println((i+1) +"번 학생의 등급은 C 입니다.");
		else if (scores[i] >=60)
			System.out.println((i+1) +"번 학생의 등급은 D 입니다.");
		else
			System.out.println((i+1) +"번 학생의 등급은 E 입니다.");
		}
}
}

//열거 타입 추가
enum Grade {
	A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");

	private String s;

	Grade(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}


