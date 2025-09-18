 package recursion;

import java.util.Scanner;

public class fibonnaciiter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no :");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        if(n<1){
            System.out.println(0);
        }
        else if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.println(0);
            System.out.println(1);
        }
        else{
               System.out.println(0);
            System.out.println(1);

        for(int i=0;i<(n-2);i++){
            
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
    }

    
}