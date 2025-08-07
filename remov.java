public class remov {
    public static void main(String[] args) {
       String str="ajayreddy";
       String result="";
       for(char ch:str.toCharArray()){
        if("aeiouAEIOU".indexOf(ch)==1){
            result+=ch;
        }
        
    }
    System.out.println("result :" + result);
}
}
