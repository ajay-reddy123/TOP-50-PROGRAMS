import java.util.Scanner;
public class small {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int size=obj.nextInt();
        int []arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        int min=arr[0];
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
                count++;
            }
        }
        System.out.println("min:"+min);
    }
}
