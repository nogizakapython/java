import java.util.ArrayList;

public class paiza_10_01 {
    public static void main(String... args) {
        ArrayList<String> users = new ArrayList<>();

        users.add("kirishima");
        users.add("rokumura");
        users.add("midorikawa");

        users.forEach((String user) -> {
           System.out.println(user);
        });
    }
}
