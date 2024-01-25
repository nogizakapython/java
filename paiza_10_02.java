import java.util.ArrayList;

public class paiza_10_02 {
    public static void main(String... args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("panda");

        animals.forEach(animal -> System.out.println(animal));

    }
}
