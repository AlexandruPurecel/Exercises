package Chapter45.Exercise1;

import java.util.Scanner;

public class Main {

    void main() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("""
                    1 for Fahrenheit to Celsius
                    2 for Celsius to Fahrenheit
                    3 for exit
                    Choose option:\s""");
            int input = scanner.nextInt();
            String option = switch (input) {
                case 1 -> "Fahrenheit";
                case 2 -> "Celsius";
                case 3 -> "exit";
                default -> "Invalid Input";

            };
            switch (option) {
                case "Fahrenheit" -> {
                    System.out.print("Enter Temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.print("Temperature in Celsius: " + TemperatureConverter.ToCelsius(fahrenheit));
                }
                case "Celsius" -> {
                    System.out.print("Enter Temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.print("Temperature in Fahrenheit: " + TemperatureConverter.ToFahrenheit(celsius));
                }
                case "exit" -> {
                    System.out.println("Bye bye");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid Input");
            }
            System.out.println();
        }
    }

}
