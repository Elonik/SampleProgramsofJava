
//Factorial of number

import java.util.*;

public class Factorial {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		sc.close();
		if (i > 0) {
			long out = fact(i);
			System.out.println(out);

		}

	}

	static long fact(long n) {
		if (n == 1) {
			return 1;
		}
		long fact = fact(n - 1) * n;
		return fact;
	}

}