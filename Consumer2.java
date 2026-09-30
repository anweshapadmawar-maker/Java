import java.util.function.Consumer;

public class Consumer2 {
    public static void main(String[] args) {
        Consumer<Integer> printSquare = n -> System.out.println("Square: " + (n * n));
        Consumer<Integer> checkEvenOdd = n -> {
            String result = (n % 2 == 0) ? "Even" : "Odd";
            System.out.println("Status: " + result);
        };
        Consumer<Integer> combinedConsumer = printSquare.andThen(checkEvenOdd);
        combinedConsumer.accept(5);
        combinedConsumer.accept(4);
    }
}