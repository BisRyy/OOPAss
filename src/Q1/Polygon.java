package Q1;

public class Polygon extends Geometry{
    private double length;
    private double width;
    private double height;

    public Polygon(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        this.area = this.length * this.width;
    }

    @Override
    public void calculateCircumference() {
        this.circumference = 2 * (this.length + this.width);
    }
}
