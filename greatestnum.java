import java.util.Scanner;

class greatestnum {
    public static void main(String[] args) {
        int greatest = 0;
        Scanner sc = new Scanner(System.in);

                System.out.print("Enter a:- ");
        int a = sc.nextInt();

        System.out.print("Enter b:- ");
        int b = sc.nextInt();

        System.out.print("Enter c:- ");
        int c = sc.nextInt();

                if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }
        System.out.println("The greatest number is " + greatest);

        sc.close();
    }
}