
//Armstrong Number

import java.util.*;

public class Armstrong {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int l = 0;
		int length = String.valueOf(num).length();
		if (num > 0) {
			for (int n = 0; n < length; n++) {
				int d = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(n)));
				l = l + (int) (Math.pow(Double.valueOf(d), Double.valueOf(3)));
			}

			if (l == num) {
				System.out.println("Armstrong Number");
			} else {
				System.out.println("Not a Armstrong Number");
			}
		}

	}

}