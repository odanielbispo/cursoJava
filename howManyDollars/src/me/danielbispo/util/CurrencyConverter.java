package me.danielbispo.util;

public class CurrencyConverter {

    public static final double IOF = 6.0;

    public static double convert(double price, double quantity){
        double value = price * quantity;
        return value = value + (value * IOF / 100);
    }

}
