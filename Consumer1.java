import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<String> c1 = str -> System.out.println(str.toUpperCase());
        c1.accept("Hello");
    }
}