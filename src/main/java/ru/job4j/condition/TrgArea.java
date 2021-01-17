package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double rs1 = (a + b + c) / 2;
        return Math.sqrt(rs1 * (rs1 - a) * (rs1 - b) * (rs1 - c));
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) " + result);
    }
}
