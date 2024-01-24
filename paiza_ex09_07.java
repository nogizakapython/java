import java.util.ArrayList;

public class paiza_ex09_07 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");


        System.out.println(fruits.indexOf("orange"));
        System.out.println(fruits.indexOf("banana"));
    }
}
