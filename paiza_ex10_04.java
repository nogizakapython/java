import java.util.ArrayList;

public class paiza_ex10_04 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        fruits.forEach(fruit -> {
            String fruitUpper = fruit.toUpperCase();
            System.out.println(fruitUpper);
        });
    }
}
