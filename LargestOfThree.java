public class LargestOfThree {
    public static void main(String []args){
        String s1 = "12";
        String s2 = "11";
        String s3 = "13";

        Integer num1= Integer.valueOf(s1);
        Integer num2= Integer.valueOf(s2);
        Integer num3= Integer.valueOf(s3);

        Integer largest = Math.max(num1,Math.max( num2, num3));      
        System.out.println("Numbers : " + num1+ " " + num2 + " "+ num3);
        System.out.println("Largest Of Three : " + largest);

    }
}
