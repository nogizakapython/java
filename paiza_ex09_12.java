import java.util.ArrayList;

public class paiza_ex09_12 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println("fruits：" + fruits);

        ArrayList<String> fruits_copy = new ArrayList<>(fruits);
        System.out.println("fruits_copy：" + fruits_copy);

        fruits_copy.add("grape");
        System.out.println("追加後のfruits：" + fruits);
        System.out.println("追加後のfruits_copy：" + fruits_copy);
    }
}
