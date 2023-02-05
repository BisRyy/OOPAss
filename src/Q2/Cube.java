package Q2;

public class Cube extends Geometry implements GeometricShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculateCircumference() {
        return 12 * side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}

