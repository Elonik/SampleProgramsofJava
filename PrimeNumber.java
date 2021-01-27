import java.util.*;

public class PrimeNumber {
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter number to bechecked::");
		long num = sc.nextLong();
		PrimeNumber obj = new PrimeNumber();
		obj.check(num);
		sc.close();
	}

	void check(long num) {
		if(num<0) {
			System.out.println("Please enter valid number");
		}else {
			this.isPrime(num);
		}
	}
	
	void isPrime(long num) {
		long c = 0;
		for(long i = 2;i<=num;i++) {
			if(num%i==0) {
				++c;
			}
		}
		if(c>1) {
			System.out.print(num + " is not Prime Number");
		}else {
			System.out.print(num + " is Prime Number");
		}
	}
}
