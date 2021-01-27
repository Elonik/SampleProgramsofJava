//Number is odd or even

import java.util.*;

class OddEven{

public static void main(String arg[]){

	Scanner sc =new Scanner(System.in);
	int i = sc.nextInt();
	sc.close();
	if(i>0){
		if(i%2==0){
			System.out.println("Entered number is Even number");
		}else{
			System.out.println("Entered number is Odd number");
		}
	}
}

}