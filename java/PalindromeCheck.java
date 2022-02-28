import java.util.*;

public class PalindromeCheck {

    public static String checkPalindrome(String str)
    {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.charAt(str.length()-1) + checkPalindrome(str.substring(0, str.length()-1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your input: ");
        String text = input.nextLine();

        input.close();

        String res = checkPalindrome(text);

        System.out.println(res);

        if (text.equals(res)) {
            System.out.println("Palindorme");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
