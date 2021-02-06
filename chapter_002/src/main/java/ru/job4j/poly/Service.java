package ru.job4j.poly;

/**
 * @author Mikhail Pushkarev
 * @since 06.02.2021
 * @version 2.2
 * В этом классе показываю как не удобно работать с обьектами классов
 */
public class Service {

    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void extract() {
        store.save("Mikhail Pushkarev");
    }

    public static void main(String[] args) {
        Store store = new DbStory();
        Service service = new Service(store);
        service.extract();
    }
}
