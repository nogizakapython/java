import java.util.ArrayList;

public class paiza_ex09_03 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        // 指定した位置にgrapeをArrayListに追加
        fruits.add(1,"grape");

        System.out.println(fruits);
    }
}
