import java.util.Scanner;
public class allfa {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter to alphabets");
        int size=obj.nextInt();
        char []arr=new char[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.next().toLowerCase().charAt(0);
        }
        int []freq=new int[256];    
        for(int i=0;i<size;i++){
            freq[arr[i]]++;
        }
        System.out.println("duplicate");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
            System.out.print((char)i);
            }

        }
        System.out.println();
        System.out.println("occurence::");
        for (int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.print((char)i+" ");
            }
        }
        System.out.println();
        System.out.println("reverse repeat");
        for(int i=freq.length-1;i>=0;i--){
            if(freq[i]>0){
                for(int r=0;r<freq[i];r++){
                    System.out.print((char)i+" ");
                }
            }

        }
    }
}
