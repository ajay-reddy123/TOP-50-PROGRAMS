import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.err.println("enter the number");
        int num=obj.nextInt();
        int factor=1;
        for(int i=1;i<=num;i++){
            factor=factor*i;
        }
        System.out.println(factor);

    }
    
}
