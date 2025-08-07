public class str {
    public static void main(String[] args) {
        String palindrome = "mom";
        String original = palindrome;
        String reverse = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse = reverse + palindrome.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}