package recursion;

import java.util.Scanner;

public class factorialiter {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter no:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            

        }
      System.out.println(fact);
    }
}
