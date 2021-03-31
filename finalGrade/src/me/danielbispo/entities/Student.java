package me.danielbispo.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public String calc(){
        double totalGrade = grade1 + grade2 + grade3;

        if(totalGrade > 59.99){
            return "FINAL GRADE = "
                    + String.format("%.2f", totalGrade)
                    + "\nPASS";
        }
        else {
            double remaining = (60.00 - totalGrade);
            return "FINAL GRADE = "
                    + String.format("%.2f", totalGrade)
                    + "\nFAILED\nMISSING "
                    + String.format("%.2f", remaining)
                    + " POINTS";
        }
    }
}
