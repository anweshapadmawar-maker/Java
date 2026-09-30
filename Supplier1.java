import java.util.function.*;
public class Supplier1{
    public static void main(String[] args) {
        Supplier<String> s = ()->"JAVA";
        System.out.println(s.get());
    }
}