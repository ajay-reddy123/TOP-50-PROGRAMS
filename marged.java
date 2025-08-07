import java.lang.reflect.Array;
import java.util.Arrays;

public class marged {
    public static void main(String[] args) {
        int[]a={1,2,3,4};
        int[] b={6,7,8,9};
        int [] marged=new int[a.length+b.length];
        System.arraycopy(a, 0, marged, 0, a.length);
        System.arraycopy(b, 0, marged, a.length,b.length);
        System.out.println("merged num"+Arrays.toString(marged));

    }
    
}
