import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int start = sc.nextInt();

        System.out.print("Enter upper bound: ");
        int end = sc.nextInt();

        int min = Math.min(start, end);
        int max = Math.max(start, end);

        int sum = 0;

        for (int i = min; i <= max; i++) {
            if (i >= min && i <= max) {
                sum += i;
            }
        }

        System.out.println("Sum of numbers between range: " + sum);

        sc.close();
    }
}