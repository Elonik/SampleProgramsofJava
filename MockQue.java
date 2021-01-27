import java.util.*;

class MockQue {

	public static void main(String arg[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of values you are goind to insert");
		int c = sc.nextInt();
		if(c>0) {
		int arr[] = new int[c];
		int f[] = new int[4];
		int k = 0;
		int out = 1;
		for(int i=0;i<c;i++){
			arr[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		if(arr.length>3) {
			for(int j = arr.length-1;j>=0;j--){
				
				if(k<4){
					f[k]=arr[j];
				}
				k++;
			}
			for(int m=0;m<4;m++) {
				out =out* f[m];
			}
			System.out.println(out);

		}else {
			System.out.println("Invalid Input");
		}

		}
	}
}