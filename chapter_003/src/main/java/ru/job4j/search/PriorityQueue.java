package ru.job4j.search;

import java.util.LinkedList;

/**
 * @author Mikhail Pushkarev
 * @since 14.02.2021
 * @version 2.2
 *
 * Здесь нужно добавить элемент  по очереди Queue
 * первый пришел последний вышел
 */
public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Мето put должен вставлять в нужную позицию элемент
     * если мы будем искать с начала массива то будет 0
     * поэтому мы проходим с конца массива
     * сравниваем приоритет и увеличиваем на один
     * если не нашли то выходим из программы
     * @param task - принимает даные
     */
    public void put(Task task) {
        int index = 0;
        for (var element : tasks) {
            if (task.getPriority() >= element.getPriority()) {
                index++;
            } else {
                break;
            }
        }
            this.tasks.add(index, task);

    }

    /**
     * метод удаляет те элементы которые пропустил
     * @return - возвращает результат
     */
    public Task take() {
        return tasks.poll();
    }
}
