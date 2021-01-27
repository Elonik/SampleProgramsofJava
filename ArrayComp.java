import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayComp {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        boolean flag = false;
        List<String> s = new ArrayList<>();
        s.addAll(Arrays.asList(magazine));
        if(magazine.length>=note.length){
           //for(int i =0;i<magazine.length;i++){
               for(int j = 0; j<note.length;j++){
                   if(s.contains(note[j])){
                	   int l = s.indexOf(note[j]);
                	   s.remove(l);
                       flag = true;
                   }else{
                       flag = false;
                       break;
                   }
               }            
            //}
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            } 
        }else{
            System.out.println("No");
        }
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
