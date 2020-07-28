package com.pluralsight.getorganized;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int count = 0;
        int altitude = 0;
        for (int i = 0; i < n; i++) {
            char step = s.charAt(i);

            if (altitude == 0 && step == 'D') {
                count++;
            }
            if (step == 'U') {
                altitude++;
            } else if (step == 'D') {
                altitude--;
            }

        }
        return count;
    }

        public static void main(String[] args)  {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt(); scan.nextLine();

            String s = scan.nextLine();

            int result = countingValleys(n, s);
            System.out.println(result);

        }
    }
