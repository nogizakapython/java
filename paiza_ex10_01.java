import java.util.*;

public class paiza_ex10_01 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));

        // forEachメソッド
        // ラムダ式
        fruits.forEach((String fruit) -> {
            System.out.println(fruit);
        });

    }


}
