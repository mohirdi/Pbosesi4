package Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Hasil penjumlahan (2 + 3) = " + calc.add(2, 3));
        System.out.println("Hasil penjumlahan (2.5 + 3.5) = " + calc.add(2.5, 3.5));
    }
}
