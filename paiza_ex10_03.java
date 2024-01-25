import java.util.ArrayList;

public class paiza_ex10_03 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        fruits.forEach(fruit -> System.out.println(fruit));

    }
}
