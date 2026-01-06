public class StringTools {

    public StringTools() {}

    public String toUpper(String text) {
        return text.toUpperCase();
    }

    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public int countChars(String text) {
        return text.length();
    }

    // Ví dụ dùngtttttt
    public static void main(String[] args) {
        StringTools tool = new StringTools();
        String s = "hello world";

        System.out.println(tool.toUpper(s));     // HELLO WORLD11
        System.out.println(tool.reverse(s));     // dlrow olleh
        System.out.println(tool.countChars(s));  // 11
    }
}
