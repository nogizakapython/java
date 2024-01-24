import java.util.ArrayList;

public class paiza_09_12 {
  public static void main(String... args) {
    ArrayList<String> members = new ArrayList<>();
    members.add("kirishima");
    members.add("midorikawa");
    members.add("rokumura");

    //以下にコードを追加
    ArrayList<String> members_copy = new ArrayList<String>(members);
    members_copy.add("nara");

    System.out.println("members：" + members);
    System.out.println("members_copy：" + members_copy);
}
}
