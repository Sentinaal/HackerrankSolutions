import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i<n; i++){
            String s = scan.next();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for (int x = 0; x < s.length(); x++){
                if (x%2==0){
                    even.append(s.charAt(x));
                }
                else{
                    odd.append(s.charAt(x));
                }

            }

            System.out.println(even + " " + odd);
        }
    }
}
