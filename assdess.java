import java.util.Scanner;
public class assdess {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int size=obj.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        boolean isAscending=true;
        boolean isDescending=true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
            if(arr[i]<arr[i+1]){
                isDescending=false;
            }
        }
        if(isAscending){
            System.out.println(" Array is Sorted Ascending");
        }else if(isDescending){
            System.out.println(" Array is Sorted Descending");
        }else{
            System.out.println("not sorted");
        }
    }
    
}
