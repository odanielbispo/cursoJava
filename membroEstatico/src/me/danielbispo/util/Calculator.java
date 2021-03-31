package me.danielbispo.util;

public class Calculator {

    // o "final" determina o valor como constante, que ele nao poderá ser alterado posteriormente.
    // todas constantes devem ser em UPPERCASE, e se for duas usar underline: PI_VALUE
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
