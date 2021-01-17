package ru.job4j.condition;

public class Point {
    
    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = x2 - x1;
        double rs2 = y2 - y1;
        double rs3 = Math.sqrt(rs1);
        double rs4 = Math.sqrt(rs2);
        double rs5 = rs3 + rs4;
        return Math.pow(rs5, 2);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
