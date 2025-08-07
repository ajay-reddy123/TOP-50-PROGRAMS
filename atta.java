import java.util.*;

public class atta {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int size = obj.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        for(int val:arr){
            sum=sum+val;
        }

        double average = (double) sum / arr.length;
        System.out.println(sum);
        System.out.println("Average: " +  average);
    }
}
