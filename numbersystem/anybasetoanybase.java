package numbersystem;

import java.util.Scanner;

public class anybasetoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int d = getValue(n,b1,b2);
		System.out.println(d);
	}
	public static int getValue(int n, int b1, int b2) {
		int dec = anyBaseToDecimal(n,b1);
		int dest = decimalToAnyBase(dec,b2);
		return dest;
	}
	public static int decimalToAnyBase(int n, int b2) { // here n = dec
		int ans = 0;
		int pow = 1;
		while(n > 0) {
			int rem = n % b2;
			n = n / b2;
			ans += rem * pow;
			pow = pow * 10;
	}
		return ans;
	}
	public static int anyBaseToDecimal(int n, int b1) {
		int ans = 0;
		int pow = 1;
		while(n > 0) {
			int rem = n % 10;
			n /= 10;
			ans += rem * pow;
			pow = pow * b1;
	}
		return ans;
}
}