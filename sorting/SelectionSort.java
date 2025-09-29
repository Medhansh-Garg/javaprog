package sorting;

import java.util.Scanner;

public class SelectionSort {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements to add in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
          for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+i+" index value:");
            arr[i]=sc.nextInt();

        
        }
        
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }
        System.out.println("sorted array:");
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}
