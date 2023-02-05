public abstract class Geometry {

    double area;
    double circumference;
    double length;
    double width;
    double height;


    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

    public abstract void calculateArea();

    public abstract void calculateCircumference();
}
