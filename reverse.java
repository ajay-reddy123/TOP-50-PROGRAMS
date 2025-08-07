import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the numbr:");
       int num =obj.nextInt();
       int original=num;
       int reverse=0;
       while (num!=0) {  
         int digit=num%10;
         reverse+=reverse*10+digit;
         num/=10;
       }    
        if(original==reverse){
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is NOT a Palindrome number");
            


        }
        }
    }


