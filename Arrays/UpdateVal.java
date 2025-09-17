package Arrays;

import java.util.Scanner;

public class UpdateVal {
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
        do{
            System.out.println("Enter 1 to update a value");
    
            System.out.println("Enter any other integer to exit");
            int no=sc.nextInt();
            if(no==1){
                System.out.print("Enter index to update:");
                int ind=sc.nextInt();
                if(ind>arr.length){
                    System.out.println("index out of range");
                    continue;

                }
                System.out.print("Enter value:");
                int val=sc.nextInt();
                arr[ind]=val;
                System.out.println("updated array");
                  for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
            }
        else{
            System.exit(0);
        }

sc.close();

        
    }
    while(true);
    
}
}
