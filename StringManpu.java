import java.util.*;

public class StringManpu {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String input1 =null;
		String input2 = null;
		String input3 = null;
		char s1 ;
		String s1o="";
		char s2;
		String s2o = "";
		String s3o = "";
		 input1 = sc.next();
		 input2 = sc.next();
		 input3 = sc.next();
		
		 int l1 = input1.length();
		 int l2 = input2.length();
		 
		if(input1 != null) {
			for(int i=0; i<l1;i++) {
				s1 = input1.charAt(i);
				if(s1=='A' || s1=='a' || s1=='e' || s1=='E' || s1=='i' || s1=='I' || s1=='o' || s1=='O' || s1=='u' || s1=='U') {
					s1o = s1o+"%";
				}else {
					s1o = s1o+s1;
				}
			}
		}
		
		if(input2 != null) {
			for(int i=0; i<l2;i++) {
				s2 = input2.charAt(i);
				if(s2=='A' || s2=='a' || s2=='e' || s2=='E' || s2=='i' || s2=='I' || s2=='o' || s2=='O' || s2=='u' || s2=='U') {
					
					s2o = s2o+s2;
				}else {
					s2o = s2o+"#";
				}
			}
		}
		
		if(input3 != null) {
			s3o = input3.toUpperCase();
		}
		
		System.out.println(s1o+s2o+s3o);
		sc.close();
		
	}
}
