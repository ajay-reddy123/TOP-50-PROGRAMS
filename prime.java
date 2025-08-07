import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=obj.nextInt();
        boolean isprime=true;
        if(num==0 ||num==1){
            System.out.println("notprime");
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isprime=false;
                     }

            }
        }
        if(isprime){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the given number is not a prime");
        }
    }
}