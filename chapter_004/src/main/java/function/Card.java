package function;

import java.util.stream.Stream;

enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
     V_6, V_7, V_8

}

 public class Card {
     private Suit suit;
     private Value value;

     public static void main(String[] args) {
         Stream.of(Suit.values())
                 .flatMap(suit -> Stream.of(Value.values())
                 .map(v -> suit + " " + v))
                         .forEach(System.out::println);
     }
 }


