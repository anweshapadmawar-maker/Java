import java.util.function.*;
public class Function1 {
    public static void main(String[] args){
        Function<String, Integer> getLength = str -> str.length();
        System.out.println(getLength.apply("Java"));
        System.out.println(getLength.apply("Functional"));
    }
    
}
