import java.util.ArrayList;

public class paiza_ex11_02 {
    public static void main(String... args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        for(String fruit : fruits){
            String delicious = fruit + "がおいしい";
            System.out.println(delicious);
        }

    }
}
