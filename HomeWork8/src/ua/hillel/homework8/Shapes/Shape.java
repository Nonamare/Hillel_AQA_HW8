package ua.hillel.homework8.Shapes;

// Створити суперклас Shape, який буде містити в собі методи:
// calculateArea(), calculatePerimeter та paint().Та поле color;
public abstract class Shape {
    public String color;

    public String shapeName;

    double area;
    double perimeter;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract boolean equals(Object o);

    public abstract int hashCode();

    public abstract String toString();

    /**
     * @param color - modern colors can be defined by any set of characters :( Girlish names like 'color of sea wave on sunset' are ok
     */
    public void paint(String color) {
        this.color = color;
    }

    public Shape() {
        color = "Transparent";
        shapeName = "Shape";
    }
}

