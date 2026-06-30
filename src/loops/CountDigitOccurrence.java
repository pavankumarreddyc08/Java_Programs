package loops;

import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Math.abs(sc.nextInt());
        int target = sc.nextInt();

        int count = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit == target)
                count++;

            num /= 10;
        }

        System.out.println("Occurrences = " + count);
    }
}
