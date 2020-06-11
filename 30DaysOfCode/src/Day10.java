import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int consec1=0;
        String binaryStr = Integer.toBinaryString(n);
        String [] strComp = binaryStr.split("0");
        for (int i = 0; i < strComp.length; i++){
            if (consec1 < strComp[i].length()){
                consec1 = strComp[i].length();
            }
        }
        System.out.print(consec1);
        scanner.close();
    }
}
