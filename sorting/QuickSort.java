package sorting;

import java.util.Scanner;

public class QuickSort {
    public static int partition(int arr[],int low,int high){
         int j=low;
        int i=low-1;
        int pivot=arr[high];
        while(j<high){
            if(pivot>arr[j]){
                
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
            else{
                j++;
            }
        
        }
        i++;
           int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
        return i;
        
    }
    public static void QuickSort(int arr[],int low,int high){
        if(low>high){
            return;
        }
        
       int i=partition(arr, low, high);
        
          QuickSort(arr,low,i-1);
         QuickSort(arr, i+1, high);
    }
    public static void main(String[] args) {
        
    
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements to add in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
          for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+i+" index value:");
            arr[i]=sc.nextInt();
        
          }

        
        QuickSort(arr,0,arr.length-1);
           for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    }



        
