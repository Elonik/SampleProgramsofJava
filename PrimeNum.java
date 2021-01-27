// n Prime numbers

import java.util.*;

public class PrimeNum{
	static int c = 0;
public static void main(String arg[]){
	
Scanner sc = new Scanner(System.in);
System.out.println("Please Enter Number of Prime");
int i = sc.nextInt();
List ls = new ArrayList();

for(int j = 1 ; ls.size()<=i; j++){

if(isPrime(j)){
ls.add(j);
System.out.println(" "+j);

}

}

}

static boolean isPrime(int k){


for(int m = 1 ; m<=k ;m++){

if(k%m==0){
c++;
}

if(c==2){
return true;
}else{
return false;
}

}
return false;

}
}

