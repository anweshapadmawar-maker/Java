
import java.util.Scanner;
class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuffer(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}

