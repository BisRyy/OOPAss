package Q2;


public class Square extends Geometry implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculateCircumference() {
        return 4 * side;
    }

    @Override
    public double calculateVolume() {
        return 0; // Not applicable for 2D shapes
    }
}