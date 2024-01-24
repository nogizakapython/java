import java.util.ArrayList;

public class paiza_ex09_05 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        String fruit = fruits.get(1);
        System.out.println(fruit);
    }
}
