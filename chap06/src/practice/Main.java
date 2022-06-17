package practice;
import java.util.*;
public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double m = sc.nextInt();
		double o,p,q = 0;
		int r = 0;
		
		for(int i = n-1; i >0; i--) {
			o  = q/(Math.pow(10, i));
			q = m%(Math.pow(10, i));
			System.out.println((int)o);
			System.out.println((int)q);
		}
		
		
	}	
}