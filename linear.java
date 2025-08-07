public class linear {
    public static void main(String[] args) {
        int [] arr={1,2,3,9,6,7};
        int key=7;
        boolean found=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("it's key found " + i);
                found=true;
            }
        }
        if(! found){
            System.out.println("not found");
        }

    }
    
}
