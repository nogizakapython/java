import java.util.ArrayList;

public class paiza_ex12_06 {
    public static void main(String... args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(1);
        scores.add(2);
        scores.add(3);
        scores.add(4);
        scores.add(5);

        scores.forEach(score -> {
            if (score % 2 == 0){
                System.out.println(score + "は偶数");
            } else {
                System.out.println(score + "は奇数");
            }
        });
    }
}
