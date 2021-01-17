package ru.job4j.converter;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 170;
        double man = Fit.manWeight(height);
        System.out.println("Man 172 is " + man);
        short height2 = 150;
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 155 is " + woman);

        short in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        boolean passed = expected == out;
        System.out.println("Man 172 are 82.8: Test is " + passed);

        short in2 = 150;
        double expected2 = 46.0;
        double out2 = Fit.womanWeight(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("Woman 155 are 51.74999999999999: Test is " + passed2);
    }
}
