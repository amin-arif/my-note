import java.lang.String;

// In Java, string is an object that represents a sequence of characters.
// String objects are stored in a special memory area known as the "string constant pool".
// String is immutable which means it cannot be changed. Whenever string is changed, a new instance is created.
// The java.lang.String class is used to create a string object

public class StringNote {
    public static void main(String[] args) {
        char[] ch = { 'A', 'r', 'i', 'f' };

        // Character to String conversion
        String st = new String(ch);
        System.out.println(st);

        // String format
        System.out.println(String.format("Hello %s", st));

        String name =  "Bangladesh";

        System.out.println(name.substring(6)); // substring(startIndex) | startIndex -> inclusive
        System.out.println(name.substring(0, 6)); // substring(startIndex, endIndex) | endIndex -> exclusive

        System.out.println("Length of string: " + name.length()); // length of string

        System.out.println("Character of index 1: " + name.charAt(1)); // return a character value

    }
}
