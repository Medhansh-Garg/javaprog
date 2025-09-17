package Arrays;

import java.util.Scanner;

public class PrintVal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements to add in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
          for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+i+" index value:");
            arr[i]=sc.nextInt();
        
        }


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
