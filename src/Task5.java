import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(5, "string 5");
        map.put(4, "string 4");
        map.put(1, "string 1");
        map.put(2, "string 2");
        map.put(3, "string 3");
        System.out.println(map);
    }
}

