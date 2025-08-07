import java.util.Scanner;
public class fiboncici {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       int num=obj.nextInt();
       int a=0;
       int b=1;
       System.out.print(a+" "+b+" ");
       for(int i=1;i<=num;i++){
        int c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;

        
       }
    }
   
        }