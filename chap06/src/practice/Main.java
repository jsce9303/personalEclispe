package practice;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++) {
			int a= sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
			int e = sc.nextInt(); int f = sc.nextInt(); int g = sc.nextInt();
			int x = 0, y = 0, z = 0;
			if(a>e) {
				x= e+24 - a;
			}else if(a<e&&(f==0&&g==0)) {
				x = e-a;
			}else if(a<e&&(b>f||(c>g&&b>=f))){
				x = e-a-1;
			}
			System.out.println(x+" "+y+" "+z);
		}
}
}
	


