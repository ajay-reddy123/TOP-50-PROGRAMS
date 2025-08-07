import java.util.Scanner;
public class poli {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the name:");
        String name=obj.nextLine();
        String reverse="";
        for(int i=name.length()-1;i>=0;i++){
            reverse+=name.charAt(i);
            if(reverse.equals(reverse)){
                System.out.println(reverse + "it's polindrome");

            }else{
                System.out.println(reverse + "it's not polindrome");
            }
        }

    }
    
    
}
