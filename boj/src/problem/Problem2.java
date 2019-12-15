package problem;

import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		scan.close();
		for(int i=1; i<=a; i++) {
			b += i;
		}
		System.out.println(b);
		
	}

}
