package NonPrimitiveDataTypes;

public class Homework3 {
    public static void main(String[] args) {

       // Converting Celsius to Fahrenheit
        double tempCelsius = 27.9;
        double tempFahrenheit = tempCelsius * 9/5 + 32;
        System.out.println("The current temperature in Fahrenheit is: " + tempFahrenheit);

        // Converting Fahrenheit to Celsius
        tempFahrenheit = 70;
        tempCelsius = (tempFahrenheit - 32) * 5/9;
        System.out.println("The current temperature in Celsius is: " + tempCelsius);

        // Converting Celsius to Kelvin
        tempCelsius = 23;
        double tempKelvin = tempCelsius + 273.15;
        System.out.println("The current temperature in Kelvin is: " + tempKelvin);

        // Converting Fahrenheit to Kelvin
        tempFahrenheit = 75;
        tempKelvin = (tempFahrenheit + 459.67) * 5/9;
        System.out.println("The current temperature in Kelvin is: " + tempKelvin);

        // Converting Kelvin to Fahrenheit
        tempKelvin = 300;
        tempFahrenheit = tempKelvin * 9/5 - 459.67;
        System.out.println("The current temperature in Fahrenheit is: " + tempFahrenheit);

        // Converting Kelvin to Celsius
        tempKelvin = 300;
        tempCelsius = tempKelvin - 273.15;
        System.out.println("The current temperature in Celsius is: " + tempCelsius);



    }

}