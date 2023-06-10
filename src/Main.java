import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "пять"));
        task1(nums);
        System.out.println();
        task2(nums);
        System.out.println();
        task3(strings);
        System.out.println();
        task4(strings);

    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

    }

    public static void task2(List<Integer> nums) {
        Set<Integer> dig = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                dig.add(num);
            }
        }
        System.out.println(dig);
    }

    public static void task3(List<String> word) {
        Set<String> setWord = new HashSet<>(word);
        System.out.println(setWord);
    }

    public static void task4(List<String> word) {
        Map<String, Integer> map = new HashMap<>();
        for (String element: word) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            }else map.put(element, 1);
        }
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            if (element.getValue() > 1) {
                System.out.println(element);
            }
        }
    }
}