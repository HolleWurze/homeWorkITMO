package ITMO.lab4;

public class SearchOdd {
    public static void main(String[] args) {
        int i = 1;
        SearchOddMethod(i);
    }

    private static void SearchOddMethod(int i) {
        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
