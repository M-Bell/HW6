import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);
        System.out.println(list);
        list = list.stream().filter(x -> x % 3 != 0).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("Task 2");
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Melon");
        fruits.add("Grapefruit");
        System.out.println("Before change - " + fruits);
        if (fruits.contains("Orange")) {
            fruits = fruits.stream().map(x -> x.equals("Orange") ? "Grapefruit" : x).collect(Collectors.toList());
        } else {
            System.out.println("There is no Orange in list");
        }
        fruits.add("Orange");
        System.out.println("Before change - " + fruits);
        if (fruits.contains("Orange")) {
            fruits = fruits.stream().map(x -> x.equals("Orange") ? "Grapefruit" : x).collect(Collectors.toList());
        } else {
            System.out.println("There is no Orange in list");
        }
        System.out.println(fruits);

        System.out.println("Task 3");
        List<Integer> list1 = new ArrayList<>(List.of(new Integer[]{2, 3, 12, 32, 1, -5}));
        List<Integer> list2 = new ArrayList<>(List.of(new Integer[]{0, 1, 4, 6, 9, 22}));
        List<Integer> list3 = new ArrayList<>(List.of(new Integer[]{-4, 122, 5143, 1234, 333, -1}));
        System.out.println("List1 = " + list1);
        System.out.println("List2 = " + list2);
        System.out.println("List3 = " + list3);
        System.out.println("List1 and List2 duplicates: " + haveDuplicates(list1, list2));
        System.out.println("List2 and List3 duplicates: " + haveDuplicates(list2, list3));
    }

    private static boolean haveDuplicates(List<Integer> list1, List<Integer> list2) {
        for (int a : list1) {
            if (list2.contains(a)) return true;
        }
        return false;
    }

}
