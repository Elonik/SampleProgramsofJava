
//Perfect Number

import java.util.*;

public class PerfectNum {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if (num > 0) {
			int total = 0;
			for (int i = 1; i < num; i++) {

				if (num % i == 0) {
					total = total + i;
				}
			}

			if (total == num) {
				System.out.println("Perfect Number");
			} else {
				System.out.println("Not a Perfect Number");
			}

		}

	}

}