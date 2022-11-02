import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private static Map<String, Integer> map = new HashMap<>();

    public static void updateValue(String key, Integer value){
        if (map.containsKey(key) && key.equals(value)) {
            throw new RuntimeException("Такой ключ уже есть и значения совпадают");
        }
            map.put(key, value);
        }

    public static void main(String[] args) {
        map.put("aaa", 123);
        map.put("sss", 321);
        map.put("ddd", 231);
        map.put("fff", 132);
        map.put("fff", 444);
        System.out.println(map);




    }
}
