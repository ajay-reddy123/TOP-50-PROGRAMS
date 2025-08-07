import java.util.Scanner;
public class coa {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int size=obj.nextInt();
        int[] arr=new int[size];
        int[] copy=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
         for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
         }
         System.out.println("Copied Array:");
         for(int num:arr){
            System.out.print(num+" ");
         }
    }
}
