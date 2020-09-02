
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int MaximumToys(int[] prices,int k)
    {
        Arrays.sort(prices);
        for(int i=0;i<prices.length;i++)
        {
            k-=prices[i];
            if(k<=0) return i;
        }
        return prices.length;
    }
    public static void main(String[] args) {
        int n,k;
      Scanner scan=new Scanner(System.in);
      n=scan.nextInt();
      k=scan.nextInt();
        int[] prices=new int[n];
        for (int i = 0; i < n; i++) {
            prices[i]=scan.nextInt();
        }
       int result=MaximumToys(prices,k);
        System.out.println(result);
    }
}
