import java.util.LinkedList;

public class remove {
    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<Integer>();
        int[] input = {1, 4, 2, 6, 3, 7, -1};

        for (int num : input) {
            if (num % 2 != 0) {
                n.add(num);
            }
        }

        System.out.println(n);
    }
}
