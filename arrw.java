import java.util.Scanner;
public class arrw {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int size = obj.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            
        arr[i]=obj.nextInt();
        }
        for(int hu:arr){
            System.out.print(hu+" ,");
        }
        int max=arr[0];
        for(int ju:arr){
            if(ju>max){
                max=ju;
            }
        }

        System.out.println("max numbar:"+max);
    }
}
