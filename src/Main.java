import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        System.out.println(" ");
    }

    public static void task3() {
        List<String> animals = new ArrayList<>(List.of("Лев", "Зебра", "Бобер", "Лев", "Панда", "Енот", "Панда", "Панда", "Панда", "Панда", "Скунс"));
        Set setAnimals = new HashSet<>(animals);
        animals.clear();
        animals.add(setAnimals.toString());
        System.out.println(animals);
    }

}