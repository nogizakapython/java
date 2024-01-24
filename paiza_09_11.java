import java.util.ArrayList;
import java.util.Collections;

public class paiza_09_11 {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        // 以下にコードを追加
        Collections.sort(numbers);

        System.out.println(numbers);
    }
}
