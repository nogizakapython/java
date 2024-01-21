import java.util.ArrayList;

public class paiza_ex09_04 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.set(1,"grape");

        System.out.println(fruits);
    }
}
