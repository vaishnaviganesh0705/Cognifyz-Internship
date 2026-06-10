import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEMPERATURE CONVERTER =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {

            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        } else if (choice == 2) {

            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);

        } else {

            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
