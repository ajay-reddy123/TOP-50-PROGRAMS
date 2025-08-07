import java.util.*;
public class summat {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=obj.nextInt();
        int [][]arr=new int[size][size];
 
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=obj.nextInt();
            } 
        }
           int sum=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            sum+=arr[i][j];
        }
    }
        System.out.println("sum ="+sum);
    }
}
