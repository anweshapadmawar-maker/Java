import java.util.function.*;

public class Predicate2{
    public static void main(String[] args){
        Predicate<Integer> p = n -> n > 0;
        System.out.println(p.test(10));
        System.out.println(p.test(-5));
    }
}