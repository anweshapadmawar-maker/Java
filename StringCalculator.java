import java.util.Scanner;
public class StringCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second number: ");
        String str2 = sc.nextLine();
        System.out.println("Enter operation: ");
        char operation = sc.nextLine().charAt(0);

        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        double result = 0;
        boolean validOperation = true;

        switch(operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result = (double) num1/num2;
                }
                else{
                    System.out.println("Error : Division by 0 is not allowed");
                }
                break;
            default:
                System.out.println("Invalid Operation!");
                validOperation=false;
        }
        if(validOperation){
            System.out.println("Result: " + result);
        }



    }
}
