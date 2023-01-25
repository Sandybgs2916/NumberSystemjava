package numbersystem;

import java.util.Scanner;

public class basetobaseaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int ans = 0;
		int p = 1;
		int c = 0;
		while(n1 > 0 || n2 > 0 || c > 0) {
			int d1 = n1 % 10;
			int d2 = n2 % 10;
			n1 = n1 / 10;
			n2 = n2 / 10;
			int d = d1 + d2 + c;
			c = d / b;
			d = d % b;
			ans += d * p;
			p = p * 10;
		}
		System.out.println(ans);
	}
}