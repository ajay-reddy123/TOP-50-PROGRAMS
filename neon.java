public class neon {
    public static void main(String[] args) {
        int n=9;
        int sqr=n*n;//81
        int sum=0;//add
        while(sqr>0){
            int val=sqr%10;//add the number
            sum=val+sum;//add the sum off val and squer
            sqr=sqr/10;
        }
        if (sum==n){
            System.out.println("neon"+n);
        }else{
            System.out.println("notneon"+n);
        }

    }
    
}
