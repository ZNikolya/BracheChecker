package homework.BraceChecker.BracheChecker;

public class Stack {

    private int[] stck;
    private int tos;

    public Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Ստէտը լցված է");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stck[tos--];
        }
    }
}