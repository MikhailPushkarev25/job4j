package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == null) {
                int point = i;
                for (int j = point; j < array.length; j++) {
                    if (array[j] != null) {
                     String str = array[point];
                     array[point] = array[j];
                     array[j] = str;
                     break;
                    }
                }
            }
            System.out.println(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compress = compress(input);
        System.out.println();
        for (int i = 0; i < compress.length; i++) {
            System.out.println(compress[i] + " ");
        }
    }

}
