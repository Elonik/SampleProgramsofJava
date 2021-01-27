
//N prime number

import java.util.*;

class Nprime {
	static int c = 0;
	static int k = 1;

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		System.out.println("input:" + in);
		int arr[] = new int[in];
		for (int i = 2; k<=arr.length; i++) {
			if (isPrime(i)) {
				++k;
				arr[c] = i;
				System.out.println(i);
			}
		}
	}

	static boolean isPrime(int i) {
		int cnt = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				cnt++;
			}
		}

		if (cnt == 2) {
			if (k != 1) {
				++c;
				
			}
			return true;
		} else {
			return false;
		}

	}
}