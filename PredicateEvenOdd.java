 import java.util.function.*;
public class PredicateEvenOdd {
    public static void main(String[] args){
        Predicate<Integer> p = n -> n % 2 == 0;
        System.out.println(p.test(10));
        System.out.println(p.test(-5));
    }
}

