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

     public Card(Suit suit, Value value) {
         this.suit = suit;
         this.value = value;
     }

     @Override
     public String toString() {
         return "Card{" + "suit=" + suit + ", value=" + value + '}';
     }

     public static void main(String[] args) {
         Stream.of(Suit.values())
                 .flatMap(suit -> Stream.of(Value.values())
                 .map(v -> new Card(suit, v)))
                         .forEach(System.out::println);
     }
 }


