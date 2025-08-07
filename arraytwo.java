import java.util.Scanner;
public class arraytwo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int [][] arr=new int[2][3];
        System.out.println("enter the elements");
         for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=obj.nextInt();
            }
         }
         for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
         }
        }
    
}
