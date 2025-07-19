package Algorithm.Sort;

import Algorithm.Sort.LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
//        BubbleSort.Do(new int[]{1,2,3});

        LinkedList list = new LinkedList();
        list.add(5);
        list.add(9);
        list.add(1);
        list.add(33);
        list.add(3);
        list.add(36);
        list.add(33);
        list.add(673);
        list.add(325);
        list.add(383);
        System.out.println("BEFORE SORTING");
        list.printList();
        list.sort();
        System.out.println("AFTER SORTING");
        list.printList();
    }
}
