import java.util.Scanner;
class Check {
    public static void main(String[] args) {
        String psd = "Anu1234";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String enteredpsd = scanner.next();
        if (enteredpsd.equals(psd)) {
            System.out.println("Access granted!!");
        } else {
            System.out.println("Access denied!!");
        }
        scanner.close(); 
    }
}