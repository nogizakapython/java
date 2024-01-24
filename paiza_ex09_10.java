import java.util.ArrayList;

public class paiza_ex09_10 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
