package numbersystem;

import java.util.Scanner;

public class decimaltooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int multi = 1;
		while(n != 0) {
			int rem = n % 8;
			ans = ans + (rem * multi);
			n = n / 8;
			multi = multi * 10;
		}
		System.out.println(ans);
	}
}