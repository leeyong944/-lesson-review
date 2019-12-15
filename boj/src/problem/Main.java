package problem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		if(a>b) {
			if(b>c) {
				System.out.println(b);
			}else if(c>a) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(a>c) {
				System.out.println(a);
			}else if(b>c) {
				System.out.println(c);
			}else {
				System.out.println(b);
			}
			
		}
		
	}

}
