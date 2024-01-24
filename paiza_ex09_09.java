import java.util.ArrayList;

public class paiza_ex09_09 {

    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        System.out.println(fruits);
        System.out.println(fruits.size());
        fruits.remove(1);
        System.out.println(fruits);
        System.out.println(fruits.size());

    }

}
