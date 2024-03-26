import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String[] array = {"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        list.add(0, "red");
        System.out.println(list);

    }
}

