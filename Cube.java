public class Cube {
    double length;
    double breadth;
    double height;
    Cube(){
        length = 1.3;
        breadth = 1.3;
        height = 1.3;
    }
    public Cube(double side){
        length = side;
        breadth = side;
        height = side;
    }
    public Cube(double l, double b, double h){
        length =l;
        breadth = b;
        height = h;
    }
    public double calculatevol5(){
        return length * breadth * height;
    }
    public void displayvol(){
        System.out.println("Dimensions:" + " Length = " + length + " Breadth = " + breadth + " Heigth = " + height);
        System.out.println("Volume = " + calculatevol());
    }
    public static void main(String[] args){
Cube c1 = new Cube();
Cube c2 = new Cube();
Cube c3 = new Cube();

c1.displayvol();
c2.displayvol();
c3.displayvol();

    }

    
}
