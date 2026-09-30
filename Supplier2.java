import java.util.function.*;
public class Supplier2 {
    public static void main(String[] args){
        Supplier<Integer>s = ()-> 100;
        System.out.println(s.get());
    }
}
