import java.util.Scanner;
public class aaa {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size");
        int size=obj.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        int freq=obj.nextInt();
        boolean isfound=false;
        for(int val:arr){
            if(val==freq){
                isfound=true;
                break;
            }else{
                isfound=false;
            }
        }
        if(isfound){
            System.out.println("is found");
        }else{
            System.out.println("not found");
        }
        }

    }
    
