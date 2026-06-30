package loops;
import java.util.Scanner;
public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Math.abs(sc.nextInt());

        int even = 0, odd = 0;

        if (num == 0) {
            even = 1;
        }

        while (num != 0) {
            int digit = num % 10;

            if (digit % 2 == 0)
                even++;
            else
                odd++;

            num /= 10;
        }

        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);
    }
}
