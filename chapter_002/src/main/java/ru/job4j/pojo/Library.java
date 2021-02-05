package ru.job4j.pojo;

/**
 * @author Mikhail Pushkarev
 * @since 05.02.2021
 * @version 2.2
 * В этом классе я демонстрирую обьекты, и как выводить данные через цикл for
 * так же некоторые манипуляции
 */
public class Library {
    public static void main(String[] args) {
        Book clean = new Book("Clean Code", 500);
        Book gerbert = new Book("Gerbert Shildt", 800);
        Book ice = new Book("Ice", 340);
        Book woice = new Book("Woice", 290);
        System.out.println("Demonstration of the model");
        Book[] books = new Book[4];
        books[0] = clean;
        books[1] = gerbert;
        books[2] = ice;
        books[3] = woice;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPaged());
        }
        System.out.println("Rearrange the array");
        Book book = books[0];
        books[0] = books[3];
        books[3] = book;
        for (int i = 0; i < books.length; i++) {
            Book book1 = books[i];
            System.out.println(book1.getName() + " - " + book1.getPaged());
        }
        System.out.println("Clean Code demonstration");
        for (int i = 0; i < books.length; i++) {
            Book book1 = books[i];
            if (book1.getName().equals("Clean Code")) {
                System.out.println(book1.getName() + " - " + book1.getPaged());
            }
        }
    }
}
