package Kombinasi
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Luas lingkaran: " + circle.calculateArea());
        System.out.println("Luas persegi panjang: " + rectangle.calculateArea());
    }
}
