public class Square extends Geometry{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        this.area = Math.pow(this.length, 2);
    }

    @Override
    public void calculateCircumference() {
        this.circumference = 4 * this.length;
    }
}
