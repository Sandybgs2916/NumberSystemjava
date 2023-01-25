package numbersystem;

import java.util.Scanner;

public class decimaltoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		int ans = 0;
		int p = 1;
		while(num > 0) {
			int rem = num % base;
			num = num /base;
			ans += rem * p;
			p = p * 10;
		}
		System.out.println(ans);
	}
}