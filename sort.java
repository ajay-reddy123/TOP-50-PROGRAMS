public class sort {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,10};
            boolean isSorted=true;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    isSorted=false;
                    break;
                }
            }
            System.out.println(isSorted?"sorted":"Not sorted");
        }
    }