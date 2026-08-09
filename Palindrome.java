import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        String clean = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer sb = new StringBuffer(clean);
        String reversed = sb.reverse().toString();
        if (clean.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        scanner.close();
    }
}