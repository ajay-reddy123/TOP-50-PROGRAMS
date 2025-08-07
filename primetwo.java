public class primetwo {
    public static void main(String[] args) {
        int num=4;
        boolean isprime=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }
        System.out.println(num+ "is" +isprime);

    }
    
}
