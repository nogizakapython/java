import java.util.ArrayList;

public class paiza_09_05 {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");

        // 以下にコードを追加
        String member = members.get(1);
        System.out.println(member);
    }
}
