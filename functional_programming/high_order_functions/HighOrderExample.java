import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class HighOrderExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Abc");
        list.add("BCD");

        Collections.sort(list, (String a, String b) -> {
            return a.compareTo(b);
        });

        System.out.println(list);
    }

}