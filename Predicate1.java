@FunctionalInterface 
interface Message {
    void show();
}

public class Predicate1 {
    public static void main(String[] args) {
        Message m = () -> {
            System.out.println("HELLO!");
        }; // Added missing semicolon
        
        m.show();
    }
}