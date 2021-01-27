
//Palindrome

import java.util.*;

public class Pal {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		String or = sc.nextLine();
		sc.close();
		String rv = "";
		int l = or.length();
		if (l > 0) {
			for (int i = l - 1; i >= 0; i--) {
				rv = rv + String.valueOf(or.charAt(i));
			}
			if ((rv).equals(or)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not Palindrome");
			}
		}

	}
}