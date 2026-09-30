@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}
public class Demo1{
    public static void main(String [] args){
        MathOperation m1 = (a,b) -> a + b;
        System.out.println(m1.operate(5,3));
    }
}