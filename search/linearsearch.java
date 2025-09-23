package search;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        
    
      Scanner sc=new Scanner(System.in);
           System.out.print("Enter no of elements to add in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
          for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+i+" index value:");
            arr[i]=sc.nextInt();

        
        }
        System.out.println("enter target element");
        int t=sc.nextInt();
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(t==arr[i]){
                idx=i;

            }
        }
        if(idx!=-1){
            System.out.println("elment found at "+idx);

        }
        else{
            System.out.println("not found");
        }
sc.close();
    }
}
