package com.pluralsight.getorganized;

import static java.lang.Integer.max;
import static java.lang.Math.abs;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {

    static int makeAnagram(String a, String b) {
        int[] letters1=new int[27];
        int[] letters2=new int[27];
        int count=0;
        for(int i=0;i<a.length();i++)
           letters1[a.charAt(i)-'a']++;
       for(int i=0;i<b.length();i++)
             letters2[b.charAt(i)-'a']++;
       for(int i=0;i<26;i++)
           count+=abs(letters1[i]-letters2[i]);
       return count;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        System.out.println(res);

        scanner.close();
    }
}
