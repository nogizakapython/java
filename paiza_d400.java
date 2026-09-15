import java.util.*;
public class paiza_d400 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Integer n = Integer.parseInt(line);
        if(n >= 9){
            System.out.println("Yes");
        } else if (n < 9) {
            System.out.println("No");

        }
    }
}
