package Q2;

public class Circle extends Geometry implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double calculateVolume() {
        return 0; // Not applicable for 2D shapes
    }
}


