import java.util.Scanner;
class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter index to replace: ");
        int index = scanner.nextInt();
        System.out.print("Enter new character: ");
        char newChar = scanner.next().charAt(0);
        if (index >= 0 && index < str.length()) {
            // Strings are immutable, so we build a new string using substring
            String result = str.substring(0, index) + newChar + str.substring(index + 1);
            System.out.println("Modified string: " + result);
        } else {
            System.out.println("Invalid index!");
        }
        scanner.close();
    }
}
