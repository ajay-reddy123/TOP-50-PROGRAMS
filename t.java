import java.util.Scanner;
public class t{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=obj.next().charAt(0);
        if(Character.isLowerCase(ch)){
            System.out.println(Character.toUpperCase(ch));
        }else{
            System.out.println(Character.toLowerCase(ch));
        }

    }
    
}
