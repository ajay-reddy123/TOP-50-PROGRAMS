import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size =obj.nextInt();
        System.out.println("Enter the number");
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                max=arr[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("min"+min);
    }
}
