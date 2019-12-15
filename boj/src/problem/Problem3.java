package problem;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		for(int i=0;i<a;i++) {
			b = scan.nextInt();
			c = scan.nextInt();
			System.out.println(b+c);
		}
		scan.close();

	}

}
