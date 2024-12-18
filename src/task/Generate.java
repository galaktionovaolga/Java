package task;

import java.util.Arrays;
import java.util.Random;

public class Generate {
    Random rand = new Random();

    public Square makeSquare (){
        Square square = new Square(rand.nextInt(1, 50));
        return square;
    }

    public Triangle makeTriangle (){
        Triangle triangle = new Triangle(rand.nextInt(1, 50), rand.nextInt(1, 50), rand.nextInt(1, 50));
        if (triangle.side < (triangle.height + triangle.base)){
        }
        return triangle;
    }

    public Circle makeCircle (){
        Circle circle = new Circle(rand.nextInt(1, 50));
        return circle;
    }

    public static double[] getArrayOfCircles(){
        double[] arrayOfCircles = new double[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            double radius = rnd.nextDouble(1,100);
            arrayOfCircles[i] = Math.PI* radius * radius;
        }
        return arrayOfCircles;
    }
    public static int[] getArrayOfSqueres(){
        int[] arrayOfSqueres = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int side = rnd.nextInt(1,100);
            arrayOfSqueres[i] = (int) Math.pow (side, 2);
        }
        return arrayOfSqueres;
    }
    public static int[] getArrayOfTriangeles() {
        int[] arrayOfTriangeles = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int width = rnd.nextInt(1, 100);
            int height = rnd.nextInt(1, 100);
            arrayOfTriangeles[i] = (int) ((width * height) / 2.0);
        }
        return arrayOfTriangeles;
    }


    public static void main(String[] args) {
        Generate generator = new Generate();
        System.out.println("Квадрат " + generator.makeSquare());
        System.out.println("Круг " + generator.makeCircle());
        System.out.println("Треугольник " + generator.makeTriangle());
        System.out.println(Arrays.toString(Generate.getArrayOfSqueres()));
        System.out.println(Arrays.toString(Generate.getArrayOfCircles()));
        System.out.println(Arrays.toString(Generate.getArrayOfTriangeles()));
    }
}
