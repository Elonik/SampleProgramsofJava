import java.util.Scanner;

public class StringRev {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = "" ;
        /* Enter your code here. Print output to STDOUT. */
        for(int i = A.length()-1;i>=0;i--){
            B = B + A.charAt(i);
             System.out.println(B);
        }
        
        if(A.equals(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
