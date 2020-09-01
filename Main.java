

package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {

    static String isValid(String s)
    {
        final String GOOD="YES";
        final String BAD="NO";

        if(s.isEmpty()) return BAD;
        if(s.length()<=3) return  GOOD;

        int[]  letters= new int[26];
        for(int i=0;i<s.length();i++){
            letters[s.charAt(i)-'a']++;
        }
        Arrays.sort(letters);
        int i=0;
        while(letters[i]==0){
            i++;
        }
        int min=letters[i];
        int max=letters[25];
        String ret=BAD;
        if(min==max)ret=GOOD;
        else{
            if(max-min==1)
                ret=GOOD;
        }
        return ret;
    }
    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String s=scanner.nextLine();
	String result=isValid(s);
	System.out.println(result);
    }
}
