import java.util.function.*;

public class Function2 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = num -> num * num;
        System.out.println(square.apply(5));
        System.out.println(square.apply(12));
    }
}