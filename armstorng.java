public class armstorng {
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int result=0;
        for(int i=0;i<num;i++){
            int digit=temp%10;
        result +=digit*digit*digit;
        temp/=10;
            if(result==num){
                System.out.println(num+"true");
            }else{
                System.out.println(num+"false");
            }   
        }
    }
}
