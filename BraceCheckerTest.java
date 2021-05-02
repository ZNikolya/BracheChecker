package homework.BraceChecker.BracheChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {

        String text = "Hello (from) [Java]";
        System.out.println(text);
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
