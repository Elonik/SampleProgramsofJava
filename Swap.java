//swap Two numbers

import java.util.*;

public class Swap{

public static void main(String arg[]){

Scanner sc = new Scanner(System.in);
int i1 = sc.nextInt();
int i2 = sc.nextInt();
sc.close();
System.out.println("Original Numbers :" + i1 + ":" +i2);
int a = i2;
i2 = i1;
i1 = a;
System.out.println("Swapped Numbers :" + i1 +":" +i2);



}


}