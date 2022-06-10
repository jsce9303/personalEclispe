package practice;
import java.util.*;
public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		for(;;) {
			String str = sc.nextLine();
			int sum = 0; 
			if(str.equals("#")) {
                break;
            }
			str = str.toLowerCase();
			for(int i = 0; i < str.length(); i++) {
				switch(str.charAt(i)) {
					case 'a' :
					case 'e' :
					case 'i' :
					case 'o' :
					case 'u' :
						sum++;
					default:
						break;
				}
			}
			System.out.println(sum);
		}
}
}