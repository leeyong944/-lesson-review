package problem;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		int a = 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		scan.close();
		for(int i=1;i<=9;i++) {
			int b = a*i;
			System.out.println(a+" * "+i+" = "+b);
		}

	}

}
