public class Quadrilateral extends Geometry{
    private double length;
    private double width;
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
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

    @Override
    public void calculateArea() {
        this.area = this.length * this.width;
    }

    @Override
    public void calculateCircumference() {
        this.circumference = 2 * (this.length + this.width);
    }
}
