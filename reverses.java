import java.util.Scanner;
public class reverses {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the name:");
        String name=obj.nextLine();
        String reversed="";
        for(int i=name.length()-1;i>=0;i--){
            reversed+=name.charAt(i);
        }
        System.out.print("reversed"+"\n"+reversed);
    }
    
}
