import java.util.ArrayList;

public class paiza_09_03 {
    public static void main(String... args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        //以下にコードを追加
        members.add(0,"rokumura");

        System.out.println(members);
    }
}
