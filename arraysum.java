import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int [][] arr=new int[3][3];
        int sum=0;
        System.out.println("enter the 9 elements");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             arr[i][j]=obj.nextInt();
             sum+=arr[i][j];
            }
         }
         System.out.println("sum of three:"+sum);
    }
}