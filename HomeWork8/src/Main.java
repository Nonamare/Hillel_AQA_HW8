import ua.hillel.homework8.Books.Book;
import ua.hillel.homework8.Books.Magazine;
import ua.hillel.homework8.Books.Printable;
import ua.hillel.homework8.Mobile.Model;
import ua.hillel.homework8.Shapes.*;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Books
        Printable[] booksAndMagazines = new Printable[5];
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");
        Magazine magazine1 = new Magazine("Magazine1");
        Magazine magazine2 = new Magazine("Magazine2");
        Magazine magazine3 = new Magazine("Magazine3");
        booksAndMagazines[0] = book1;
        booksAndMagazines[1] = magazine1;
        booksAndMagazines[2] = book2;
        booksAndMagazines[3] = magazine2;
        booksAndMagazines[4] = magazine3;

        for (Printable item : booksAndMagazines) {
            item.print();
        }

        System.out.println("Theoretically magazines only");
        Magazine.printMagazines(booksAndMagazines);

        System.out.println("Now books");
        Book.printBooks(booksAndMagazines);

        System.out.println("End of experiments");
        System.out.println();

        // Mobile
        Model phone1 = new Model("Apple", "iPhone 15", "EMEI1");
        Model phone2 = new Model("Vedroid", "Gnusmas", "EMEI2");

        phone1.call("1234567890");

        phone2.sendMessage("0987654321", "Very important message");

        System.out.println();

        // Shapes
        /*
         Part 1

         В класі main створити масив з обєктами фігур
         В циклі викликати методи цих фігур
        */

        System.out.println("NOW SHAPES:");
        System.out.println();

        Shape[] shapes = new Shape[3];

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 5);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(5, 0);

        // В класі main створити масив з обєктами фігур
        shapes[0] = new Triangle(p1, p2, p3);
        shapes[1] = new Rectangle(p1, p2, p3, p4);
        shapes[2] = new Circle(p1, p2);

        // В циклі викликати методи цих фігур
        for (Shape element : shapes) {
            //System.out.println("I'm " + element.getClass().getSimpleName());
            System.out.println(" NOW " + element.getClass().getSimpleName());
            System.out.println("Perimeter is " + element.calculatePerimeter());
            System.out.println("Area is " + element.calculateArea());
            System.out.println("Default color is " + element.color);
            element.paint("Blue!");
            System.out.println("New color is " + element.color);
            System.out.println("toString(): " + element);
            System.out.println("================================");
        }

        // Коректно перевизначити методи equals(), hashCode(), toString().

        // Triangle with the same params
        Triangle anotherTriangle = new Triangle(p1, p2, p3);
        System.out.println("Triangles must be equal");
        System.out.println("Equals: " + shapes[0].equals(anotherTriangle));
        System.out.println("Hash: " + anotherTriangle.hashCode());

        // Triangle with NOT the same params
        Triangle yetAnotherTriangle = new Triangle(p1, p2, p4);
        System.out.println("Triangles must NOT be equal");
        System.out.println("Equals: " + shapes[0].equals(yetAnotherTriangle));
        System.out.println("Hash: " + yetAnotherTriangle.hashCode());
    }
}
