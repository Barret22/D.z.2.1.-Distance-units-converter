package app;

public class Converter {

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void main(String[] args) {
        // Приклад конвертації міль у кілометри
        double miles = 5;
        double kilometers = milesToKilometers(miles);
        System.out.printf("%.2f міль = %.2f кілометрів%n", miles, kilometers);

        // Приклад конвертації кілометрів у мілі
        kilometers = 8;
        miles = kilometersToMiles(kilometers);
        System.out.printf("%.2f кілометрів = %.2f міль%n", kilometers, miles);
    }
}
