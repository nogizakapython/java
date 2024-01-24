import java.util.ArrayList;

public class paiza_ex09_08 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.contains("grape"));
        System.out.println(fruits.contains("apple"));
    }
}
