class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class Q14_ShapeHierarchy {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Circle circle = new Circle(7);

        rectangle.area();
        circle.area();
    }
}