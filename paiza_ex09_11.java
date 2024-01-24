import java.util.ArrayList;
//  Collectionsパッケージを読み込む
import java.util.Collections;

public class paiza_ex09_11 {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(14);
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);

        //整列前
        System.out.println(numbers);

        // 昇順に並び替える
        Collections.sort(numbers);
        System.out.println(numbers);

        // 降順に並び替える
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);

    }
}
