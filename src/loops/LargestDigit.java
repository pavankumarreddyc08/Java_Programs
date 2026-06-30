package loops;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Math.abs(sc.nextInt());

        int max = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit > max)
                max = digit;

            num /= 10;
        }

        System.out.println("Largest Digit = " + max);
    }
}
