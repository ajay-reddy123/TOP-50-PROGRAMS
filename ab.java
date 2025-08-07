import java.util.Scanner;
public class ab{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the letters");
        int size=obj.nextInt();
        char [] arr=new char[size];
        for(int i=0;i<size;i++){
           arr[i] = obj.next().toLowerCase().charAt(0);
        }
        int[] freq=new int[256];
        for(int i=0;i<size;i++){
            freq[arr[i]]++;
        }
        System.out.println("dupilicate");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
            System.out.println((char)+i+" ");
            }  
        }
        System.out.println();
        System.out.println("unique repeatance:");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.print((char)+i+" ");
            }
        }
    }
}
