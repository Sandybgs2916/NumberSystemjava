package numbersystem;

import java.util.Scanner;

public class anybasetodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		int ans = 0;
		int p = 1;
		while(num > 0) {
			int rem = num % 10;
			num = num /10;
			ans += rem * p;
			p = p * base;
		}
		System.out.println(ans);
	}
}