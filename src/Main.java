import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int number : nums) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println(" ");
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set setItems = new LinkedHashSet(nums);
        nums.clear();
        nums.addAll(setItems);
        for (int number : nums) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

    }

}