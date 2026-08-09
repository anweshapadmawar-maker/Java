import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int reversed = 0;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            sum += digit;
            temp /= 10;
        }

        if (num < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);
        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}