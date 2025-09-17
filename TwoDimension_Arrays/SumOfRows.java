import java.util.Scanner;

public class SumOfRows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int r=sc.nextInt();
        System.out.print("Enter no of columns:");
        int c=sc.nextInt();

        int [][] arr=new int[r][c];
       System.out.println("Enter elements:");
       int Sumrows[]=new int[r];

       int Sumcol[]=new int[c];


        for(int i=0;i<r;i++){
            
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                Sumrows[i]+=arr[i][j];
                Sumcol[j]+=arr[i][j];

            }
        }

        for(int i=0;i<r;i++){
            System.out.println("sum of "+(i+1)+" row = "+Sumrows[i]);
        }
            for(int i=0;i<c;i++){
            System.out.println("sum of "+(i+1)+" col ="+Sumcol[i]);
        }
        sc.close();

    }
}
