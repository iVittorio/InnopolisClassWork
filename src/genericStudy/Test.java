package genericStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by i.viktor on 02/11/2016.
 */
public class Test {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        list.add(.10);
        list.add(.20);
        list.add(.30);
        list.add(.40);

        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = intList;

        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(list);
        printList(ls);
        process(list);

        List<Integer> list1 = new ArrayList<>();

        addNumbers(list1);

        System.out.println(list1);

    }

    public static void process (List<? extends Number> list) {
        for (Number l : list) {
            System.out.println(l);
        }
    }
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
