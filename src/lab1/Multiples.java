package lab1;

public class Multiples {

    public static void main(String[] args) {

        System.out.println(multiples(10, 3, 3));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++){

            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB) {
                count++;
            }

        }
        return count;
    }
}
