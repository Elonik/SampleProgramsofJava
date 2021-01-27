//find the second greatest number

import java.util.*;

public class SecGreat{

public static void main(String arg[]){

Scanner sc = new Scanner(System.in);
List num = new ArrayList<>();
String i = null;
do{
 i = sc.next();
if(!("q").equals(i))
num.add(Integer.parseInt(i));
}
while(!("q").equals(i));
sc.close();
if(num.size()>0){
Collections.sort(num);
Object[] arr = num.toArray();
Arrays.sort(arr);

System.out.println("Second greatest num ::" + arr[arr.length-2]);
System.out.println("greatest num ::" + arr[arr.length-1]);
}



}

}
