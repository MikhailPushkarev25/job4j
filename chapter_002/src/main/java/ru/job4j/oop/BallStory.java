package ru.job4j.oop;

/**
 * Пример взаимодействия классов и обьектов
 */

public class BallStory {

    public void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolfs wolfs = new Wolfs();
        Fox fox = new Fox();
        fox.tryEat(ball);
        ball.running(fox);
        wolfs.tryEat(ball);
        ball.running(wolfs);
        hare.tryEat(ball);
        ball.running(hare);
    }
}
