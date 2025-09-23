package search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        
    
       Scanner sc=new Scanner(System.in);
           System.out.print("Enter elements in order  to add in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
          for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+i+" index value:");
            arr[i]=sc.nextInt();

        
        }
        System.out.println("enter target element");
        int t=sc.nextInt();
        int idx=-1;
        int beg=0;
        int end=arr.length-1;
      
        while (beg<=end) {
              int mid=(beg+end)/2;
            if(arr[mid]==t){
                idx=mid;
                break;
            }
            else if(arr[mid]>t){
                end=mid-1;
                mid=beg+end/2;
            }
            else{
                beg=mid+1;
                mid=beg+end/2;
            }
            
        }
        if(idx!=-1){
            System.out.println("found at index "+idx);
        }
        else{
            System.out.println("not found");
        }
        sc.close();
        
    }
}
