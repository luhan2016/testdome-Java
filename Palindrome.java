public class Palindrome {
    public static boolean isPalindrome(String word) {
    int i1 = 0;
    int i2 = word.length() - 1;
    String newword=word.toUpperCase();
    while (i2 > i1) {
        if (newword.charAt(i1) != newword.charAt(i2)) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
