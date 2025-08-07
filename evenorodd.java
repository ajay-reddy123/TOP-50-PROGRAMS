public class evenorodd {
    public static void main(String[] args) {
        int n=12345;
        int even=0;int odd=0;
        while (n>0) {
            int val=n%10;
        if(val%2==0){
            even++;
        }else{
            odd++;
        }
        n=n/10;

    }
    System.out.println("even "+even);
    System.out.println("odd "+odd);

    }
}
