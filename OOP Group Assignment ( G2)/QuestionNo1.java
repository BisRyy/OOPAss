import java.util.Scanner;

import static java.lang.System.exit;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class QuestionNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shapeType;
        do {
            System.out.println("\t\tChoose the shape\n \t\t1. circle \n \t\t2.rectangle \n \t\t3.triangle) \n \t\t0.exit");
            shapeType = scanner.nextInt();

        double[] measurements = new double[2];

        switch (shapeType) {
            case 1:
                System.out.println("Enter the radius:");
                measurements[0] = scanner.nextDouble();
                scanner.nextLine();
                Shape circle = new Circle(measurements[0]);
                System.out.println("Area of circle is: " + circle.getArea());
                break;
            case 2:
                System.out.println("Enter the width:");
                measurements[0] = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter the height:");
                measurements[1] = scanner.nextDouble();
                scanner.nextLine();
                Shape rectangle = new Rectangle(measurements[0], measurements[1]);
                System.out.println("Area of rectangle is: " + rectangle.getArea());
                break;
            case 3:
                System.out.println("Enter the base:");
                measurements[0] = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter the height:");
                measurements[1] = scanner.nextDouble();
                scanner.nextLine();
                Shape triangle = new Triangle(measurements[0], measurements[1]);
                System.out.println("Area of triangle is: " + triangle.getArea());
                break;
            case 0: exit(0);
            default:
                System.out.println("Invalid shape.");
                break;
        }
        } while(shapeType!=0);

        scanner.close();
    }
}

