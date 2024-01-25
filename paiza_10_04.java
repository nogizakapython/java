import java.util.ArrayList;

public class paiza_10_04 {
    public static void main(String... args) {
        ArrayList<String> users = new ArrayList<>();

        users.add("kirishima");
        users.add("rokumura");
        users.add("midorikawa");

        users.forEach(user -> {
            String ans = user.toUpperCase();
            System.out.println(ans);
        });

    }
}
