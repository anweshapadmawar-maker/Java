class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public Circle(Circle source) {
        radius = source.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public Rectangle(Rectangle source) {
        length = source.length;
        width = source.width;
    }

    public double getArea() {
        return length * width;
    }
}

class Square {
    private double side;

    public Square(double s) {
        side = s;
    }

    public Square(Square source) {
        side = source.side;
    }

    public double getArea() {
        return side * side;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(5.0);
        Rectangle originalRectangle = new Rectangle(4.0, 6.0);
        Square originalSquare = new Square(4.0);

        Circle copiedCircle = new Circle(originalCircle);
        Rectangle copiedRectangle = new Rectangle(originalRectangle);
        Square copiedSquare = new Square(originalSquare);

        System.out.printf("Circle Area: %.2f%n", copiedCircle.getArea());
        System.out.printf("Rectangle Area: %.2f%n", copiedRectangle.getArea());
        System.out.printf("Square Area: %.2f%n", copiedSquare.getArea());
    }
}