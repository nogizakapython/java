import java.util.ArrayList;

public class paiza_11_02 {
    public static void main(String... args) {
        ArrayList<String> users = new ArrayList<>();

        users.add("kirishima");
        users.add("rokumura");
        users.add("midorikawa");

        for(String user : users){
            System.out.println(user);
        }
    }
}
