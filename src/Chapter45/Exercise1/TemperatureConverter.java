package Chapter45.Exercise1;

import java.util.Scanner;

public class TemperatureConverter {

    public static double ToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double ToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

}
