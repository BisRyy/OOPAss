import java.util.Scanner;

interface GeometricShape {
    double calculateArea();
    double calculateCircumference();
    double calculateVolume();
}

class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculateCircumference() {
        return 4 * side;
    }

    public double calculateVolume() {
        return 0;
    }
}

class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calculateVolume() {
        return 0;
    }
}

class Cube implements GeometricShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return 6 * side * side;
    }

    public double calculateCircumference() {
        return 12 * side;
    }

    public double calculateVolume() {
        return side * side * side;
    }
}

class Sphere implements GeometricShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class QuestionNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeometricShape shape;

        while (true) {
            System.out.print("Enter the type of shape (square, circle, cube, sphere) or \"exit\" to quit: ");
            String shapeType = scanner.nextLine();

            if (shapeType.equals("exit")) {
                break;
            }

            try {
                switch (shapeType) {
                    case "square":
                        System.out.print("Enter the side length: ");
                        double squareSide = Double.parseDouble(scanner.nextLine());
                        shape = new Square(squareSide);
                        break;
                    case "circle":
                        System.out.print("Enter the radius: ");
                        double circleRadius = Double.parseDouble(scanner.nextLine());
                        shape = new Circle(circleRadius);
                        break;
                    case "cube":
                        System.out.print("Enter the side length: ");
                        double cubeSide = Double.parseDouble(scanner.nextLine());
                        shape = new Cube(cubeSide);
                        break;
                    case "sphere":
                        System.out.print("Enter the radius: ");
                        double sphereRadius = Double.parseDouble(scanner.nextLine());
                        shape = new Sphere(sphereRadius);
                        break;
                    default:
                        System.out.println("Invalid shape type. Try again.");
                        continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            System.out.println("Area of shape is: " + shape.calculateArea());
            System.out.println("Circumference of shape is: " + shape.calculateCircumference());
            System.out.println("Volume of shape is: " + shape.calculateVolume());
            System.out.println();
        }
    }
}
