import java.util.Scanner;
public class large {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the largestnum");
        int size=obj.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
            int max = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println("max:"+max);
    }
    }
