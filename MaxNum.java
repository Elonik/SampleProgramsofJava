//Larget among N digit

import java.util.*;

public class MaxNum{

public static void main(String arg[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter number");
int i = sc.nextInt();
int arr[] = new int[i];

for(int l=0;l<i;l++){

arr[l]=sc.nextInt();

}
sc.close();
int max = max(i,arr);
System.out.println("Maxnumber is : "+max);

}

static int max(int i,int arr[]){
	int max=0;
	for(int l=0;l<i;l++){
	if(arr[l]>max){
		max = arr[l];
	}
}
	return max;
}

}

