import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    private static final Map<String, List<Integer>> map1 = new HashMap<>(5);
    private static final Map<String, Integer> map2 = new HashMap<>(5);

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            double random = Math.random() * 1000;
            listOne.add((int) random);
        }

        List<Integer> listTwo = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            double random = Math.random() * 1000;
            listTwo.add((int) random);
        }

        List<Integer> listThree = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            double random = Math.random() * 1000;
            listThree.add((int) random);
        }
        map1.put("List 1", listOne);
        map1.put("List 2", listTwo);
        map1.put("List 3", listThree);

        System.out.println(map1);


        for (var keySet : map1.keySet()) {
            Integer sum = 0;
            List<Integer> tempList = map1.get(keySet);
            for (Integer integerSum : tempList) {
                sum += integerSum;
            }
            map2.put(keySet,sum);
        }
        System.out.println(map2);

    }
}

