import java.util.*;


public class LeapYear {

	//This class is used to get input from user and print to console
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year= sc.nextInt();
	
		if(year != 0 && (year%4==0 && year % 100 != 0) || year % 400 ==0 ) {
			System.out.println("Year is leap Year");
		}else {
			System.out.println("This year is not a leap year");
		}
		sc.close();
			
	}
	
	

}


