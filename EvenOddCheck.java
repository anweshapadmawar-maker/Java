public class EvenOddCheck {
    public static void main (String[] args){
    String input = "24";
    Integer number = Integer.valueOf(input);
    if(number % 2 == 0){
        System.out.println("Number is Even !");
    }
    else{
        System.out.println("Number is Odd");
    }
    }
}
