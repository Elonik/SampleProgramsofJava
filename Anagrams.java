import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        StringBuilder sb= new StringBuilder();
        StringBuilder sb1= new StringBuilder();

        if(a.length()!= b.length()){
            //System.out.println("Not Anagrams");
            return false;
        }else{
            b= b.toLowerCase();
            a= a.toLowerCase();
            sb.append(a);
            sb1.append(b);
            for(int i = 0;i<a.length();i++){
                    String A = String.valueOf(a.toString().charAt(i));
                    if(sb1.toString().contains(A)){
                        int k = sb1.toString().indexOf(A);
                        sb1.deleteCharAt(k);
                }
            }
            if(sb1.toString().equals("")){
                //System.out.println("Anagrams");
                return true; 
            }
            return false; 
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}