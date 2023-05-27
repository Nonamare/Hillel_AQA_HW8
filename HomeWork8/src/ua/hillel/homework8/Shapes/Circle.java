package ua.hillel.homework8.Shapes;

public class Circle extends Shape {
    private Point centerPoint, circlePoint;
    public Segment radius;

    /**
     * @param centerPoint - center point
     * @param circlePoint - point on a circle
     */
    public Circle(Point centerPoint, Point circlePoint) {
        this.centerPoint = centerPoint;
        this.circlePoint = circlePoint;

        radius = new Segment(centerPoint, circlePoint);

        // Theoretically, area can be zero. Negative means undefine
        area = -1;
        perimeter = -1;

        color = "Transparent";

        shapeName = "Circle";
    }

    @Override
    public double calculateArea() {

        if (area > -1) {
            return area;
        }

        // A = πr2
        area = Math.PI * radius.length() * radius.length();
        return area;

    }

    @Override
    public double calculatePerimeter() {

        if (perimeter > -1) {
            return perimeter;
        }

        // p = 2πr
        perimeter = 2 * Math.PI * radius.length();
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // Comparison
        // By radius
        return radius.equals(((Circle) o).radius);
    }

    @Override
    public int hashCode() {

        return radius.hashCode();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius='" + radius.length() + '\'' +
                ", color='" + color +
                "'}";
    }
}
