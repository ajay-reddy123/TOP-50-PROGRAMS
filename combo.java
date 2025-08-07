import java.util.Scanner;
public class combo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        String [] arr=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextLine();

        }
        System.out.println("size2");
        int size2=obj.nextInt();
        String [] prr=new String[size2];
        for(int i=0;i<size2;i++){
            prr[i]=obj.nextLine();
        }
        obj.nextLine();

        int psize=size+size2;

        String [] comb=new String[psize];
        for(int i=0;i<arr.length;i++){
         comb[i]=(arr[i]);
        }
        for(int j=0;j<prr.length;j++){
            comb[j+size]=(prr[j]);
        }
       
          
        
        for(String wor:comb){
            System.out.print(wor+" ");
        }
    }
    
}
