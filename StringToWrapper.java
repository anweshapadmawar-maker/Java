public class StringToWrapper {
    public static void main (String [] args){
        String str="123";
        Integer integerObject=Integer.valueOf(str);
        int primitiveValue= integerObject.intValue();

        System.out.println("Original String: " + str);
        System.out.println("Wrapper Object: " + integerObject);
        System.out.println("Primiive Value: " + primitiveValue);


    }
}
