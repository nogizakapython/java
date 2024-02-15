import java.util.ArrayList;

public class paiza_12_06 {
    public static void main(String... args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(30);
        scores.add(70);
        scores.add(90);
        scores.add(69);

        scores.forEach(score -> {
           if (score >= 70){
               System.out.println("合格");
           } else {
               System.out.println("不合格");
           }
        });


    }
}
