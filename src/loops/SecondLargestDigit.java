package loops;

import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Math.abs(sc.nextInt());

        int largest = -1;
        int secondLargest = -1;

        while (num != 0) {
            int digit = num % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            num /= 10;
        }

        if (secondLargest == -1)
            System.out.println("Second largest digit does not exist.");
        else
            System.out.println("Second Largest Digit = " + secondLargest);
    }
}
