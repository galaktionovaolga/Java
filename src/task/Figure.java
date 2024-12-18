package task;

public abstract class Figure {
    String name;
    String color;

    public double calcSquare(){
        return 0;
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 2, 2);
        triangle.calcSquare();

        Square square = new Square(4);
        square.calcSquare();

        Circle circle = new Circle(3);
        circle.calcSquare();
    }
}

class Triangle extends Figure{
    int side;
    int base;
    int height;

    public Triangle(int side, int base, int height) {
        this.side = side;
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcSquare() {
        double sTriangle = 0.5 * this.base * this.height;
        System.out.println(sTriangle);
        return sTriangle;
    }
}

class Square extends Figure{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double calcSquare() {
        double sSquare = this.side * this.side;
        System.out.println(sSquare);
        return sSquare;
    }
}

class Circle extends Figure{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calcSquare() {
        double sCircle = Math.PI * this.radius * this.radius;
        System.out.println(sCircle);
        return sCircle;
    }
}
