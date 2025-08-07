import java.util.Scanner;
public class dupli {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size");
        int size=obj.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        int max=arr[0];
        for(int i:arr){
            if(i>max){
            max=i;
            }
        }
        int freq[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
            }
             System.out.println("duplicate");
            for(int z=0;z<arr.length;z++){
                if(arr[z]>1){
                System.out.print(z+" ");
                }
            }
             System.out.println("unique");
             for(int a=0;a<arr.length;a++){
                if(arr[a]==0){
                System.out.print(a+" ");
                }

        }
    }
}