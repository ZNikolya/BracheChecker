package homework.BraceChecker.BracheChecker;

public class BraceChecker {

    private final String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack(5);
        char end;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case '(', '[', '{' -> stack.push(ch);
                case ')' -> {
                    end = (char) stack.pop();
                    if (end != '(') {
                        if (end == 0) {
                            System.err.println("Error: closed ) but not opened at: " + i);
                        } else {
                            System.err.println("Error: closed ) but opened " + end + " at: " + i);
                        }
                    }
                }
                case ']' -> {
                    end = (char) stack.pop();
                    if (end != '[') {
                        if (end == 0) {
                            System.err.println("Error: closed ] but not opened at: " + i);
                        } else {
                            System.err.println("Error: closed ] but opened " + end + " at: " + i);
                        }
                    }
                }
                case '}' -> {
                    end = (char) stack.pop();
                    if (end != '{') {
                        if (end == 0) {
                            System.err.println("Error: closed } but not opened at: " + i);
                        } else {
                            System.err.println("Error: closed } but opened " + end + " at: " + i);
                        }
                    }
                }
            }
        }
        if ((end = (char) stack.pop()) != 0) {
            do {
                System.err.println("Error: opened " + end + " but not closed");
            } while ((end = (char) stack.pop()) != 0);
        }
    }
}

