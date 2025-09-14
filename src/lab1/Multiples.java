package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println("Number of Multiples of 3 or 5 below 1000:" + count);
    }
}
