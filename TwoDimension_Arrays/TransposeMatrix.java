import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side of square matrix:");
        int s=sc.nextInt();
        

        int [][] arr=new int[s][s];
       System.out.println("Enter elements: ");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("Transposed matrix");
          for(int i=0;i<s;i++){

            for(int j=0;j<s;j++){
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();
        }
sc.close();
    }
}
