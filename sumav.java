import java.util.Scanner;
public class sumav {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int size=obj.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            double avarge =sum/size;
            System.out.println("sum:"+avarge);
        }
    }
