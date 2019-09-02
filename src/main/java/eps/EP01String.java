package main.java.eps;

/*
 * 1. isBlank(); // true
 * 2. .strip(); // remove empty space from start and end
 * 3. .stripTrailing();
 * 4. .stripLeading();
 * 5. .repeat(3); // repeat strings in n times
 * 6. .lines().count(); // count lines
 * */
public class EP01String {

    public static void main(String[] args) {
        testIsBlank();

        testStrip();

        testRepeat();

        testLineCount();
    }

    public static void testLineCount() {
        System.out.println("abcdef gh".lines().count());
        System.out.println("abc\ndef\n gh\n".lines().count());
    }

    public static void testRepeat() {
        System.out.println("java".repeat(5));
    }

    public static void testStrip() {
        System.out.println("abc".strip());
        System.out.println("abc   ".strip());
        System.out.println("     abc".strip());
        System.out.println("    a bc ".strip());

        System.out.println("  abc    ".stripTrailing());
        System.out.println("  abc    ".stripLeading());
    }

    public static void testIsBlank() {
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println(" abc".isBlank());
    }
}
