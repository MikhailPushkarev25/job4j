package ru.job4j.poly;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * В это классе я использовал полиморфизм, имплементировал методы,
 * далее написал простой код
 */
public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Passengers on the spot");
    }

    @Override
    public void passengers(int num) {
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += num;
        }
        System.out.println(result);
    }

    @Override
    public int oil(int num) {
        int result = 0;
        if (num > 0) {
            result = result + num * 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(2);
        System.out.println(bus.oil(10));
    }
}
