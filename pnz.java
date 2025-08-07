import java.util.Scanner;
public class pnz {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int size=obj.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        int Positive=0;
        int Negativ=0;
        int zero=0;
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                Positive++;
            }
            else if(arr[i]<0){
                Negativ++;
            }else{
                zero++;
            }
        }
        System.out.println("Positive numbers: " + Positive);
        System.out.println("Negative numbers: " + Negativ);
        System.out.println("Zero numbers: " + zero);
     }

}
