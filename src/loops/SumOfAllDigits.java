package loops;
import java.util.Scanner;
public class SumOfAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Math.abs(sc.nextInt());
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum = " + sum);
    }
}
