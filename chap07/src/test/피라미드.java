package test;

import java.util.Scanner;


public class 피라미드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int n =  sc.nextInt();
		
		for(int i = 0; i < n+1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf("*");
			}System.out.println("");
		}System.out.printf("");
	}

}
