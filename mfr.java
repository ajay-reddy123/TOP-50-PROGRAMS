import java.util.Scanner;
public class mfr {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[][]arr=new int[5][2];
        System.out.println("Enter the 10elemants");
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=obj.nextInt();
            }
        }
         System.out.println("Matrix:");
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
