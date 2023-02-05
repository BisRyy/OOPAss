package Q1;

public class Circle extends Geometry{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void calculateCircumference() {
        this.circumference = 2 * Math.PI * this.radius;
    }
}
