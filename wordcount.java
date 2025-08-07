public class wordcount {
    public static void main(String[] args) {
        String str="i love java program";
        String[] words=str.trim().split("\\s+");
        System.out.println("wordcount:"+words.length);
    }
}
