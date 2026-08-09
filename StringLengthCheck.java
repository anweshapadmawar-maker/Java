import java.util.Scanner;
class StringLengthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int length = str.length();
        if (length % 2 == 0) {
            System.out.println("The length of the string (" + length + ") is EVEN.");
        } else {
            System.out.println("The length of the string (" + length + ") is ODD.");
        }
        scanner.close();
    }
} 
    

