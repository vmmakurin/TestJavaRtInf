import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Тест-кейс 1
        int[] array1 = {1, 3, 4, 5, 1, 5, 4};
        System.out.println("Test Case 1:");
        printFrequencies(array1);

        // Тест-кейс 2
        int[] array2 = {2, 2, 2, 2, 2};
        System.out.println("Test Case 2:");
        printFrequencies(array2);

        // Тест-кейс 3
        int[] array3 = {};
        System.out.println("Test Case 3:");
        printFrequencies(array3);
    }

    public static void printFrequencies(int[] array) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int num : array) {
            result.put(num, result.getOrDefault(num, 0) + 1);
        }

        if (result.isEmpty()) {
            System.out.println("Пустой массив. Нет элементов для подсчёта.");
        } else {
            for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        System.out.println();
    }
}
