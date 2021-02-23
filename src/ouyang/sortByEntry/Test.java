package test.ouyang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {5, 3, 5, 9, 3, 9, 3 };
        List<Entry<Integer, Integer>> sortedList = getMapByArray(array).entrySet()
                .stream()
                .sorted((Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) -> {
                    int i = e2.getValue() - e1.getValue();
                    if (i == 0) {
                        i = e1.getKey() - e2.getKey();
                    }
                    return i;
                })
                .collect(Collectors.toList());

        int[][] resultArray = new int[sortedList.size()][2];
        for (int i = 0; i < sortedList.size(); i++) {
            resultArray[i][0] = sortedList.get(i).getKey();
            resultArray[i][1] = sortedList.get(i).getValue();
        }
        System.out.println(Arrays.deepToString(resultArray));
    }

    private static HashMap<Integer, Integer> getMapByArray(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int data : array) {
            if (map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }
        return map;
    }
}
