package me.danielbispo.entities;

public class Rectangle {
    public double width, height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width * 2) + (height * 2);
    }

    public double diagonal(){
        double diagonal;
        return Math.sqrt((width * width) + (height * height));
    }
}
