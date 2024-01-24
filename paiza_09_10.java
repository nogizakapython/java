import java.util.ArrayList;

public class paiza_09_10 {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        // 以下にコードを追加
        members.clear();

        System.out.println(members);
    }
}
