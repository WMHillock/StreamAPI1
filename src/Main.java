import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Collections.sort(values);
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) <= 0 || values.get(i) % 2 != 0) {
                values.remove(i);
                i--;
            }
        }
        for (int digits : values) {
            System.out.println(digits);
        }
    }
}