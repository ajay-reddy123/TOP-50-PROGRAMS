public class occre {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,5,5,5};
        int key=5;
        int count=0;
        for(int num:arr){
            if(num==key){
                count++;
            }
        }
         System.out.print("occre"+key+":"+count);
    }
    
}
