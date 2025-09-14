package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count1 = multiples(1000, 3, 5);
        System.out.println("With args:" + count1);
        int count2 = multiples();
        System.out.println("With default:" + count2);
    }

    static int multiples(int n, int a, int b) {
        int count = 0;

        for (int i = 1; i < n; i++) {

            if (a == b) {
                if (i % a == 0) {
                    count++;
                }
            } else {
                if (i % a == 0 || i % b == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    static int multiples() {
        return multiples(1000, 3, 5);
    }
}