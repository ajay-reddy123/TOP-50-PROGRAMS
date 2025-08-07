import java.util.Scanner;
public class liner {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size");
        int size =obj.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        
        System.out.println("show the number in liner seach");
        int key=obj.nextInt();
        boolean isfound=false;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println(i);
                isfound=true;
                break;
            }
            }
             if(!isfound) {
            System.out.println("Element not found in the array.");
        }
    }
}