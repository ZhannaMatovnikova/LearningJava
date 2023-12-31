package mypacage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsIterators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5); //add добавляет элемент в список
        list.add(10);
        list.add(9);

        System.out.println(list.get(1)); // элемент 2 по счету

        int a = list.get(2);
        System.out.println(a);

        list.set(2, 100);// изменяем параметры 3 элемента
        System.out.println(list.get(2));

        System.out.println();
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println();

        System.out.println(list.size()); //размер списка

       // list.clear();
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(56);

        System.out.println();
        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());

        System.out.println();
        list.removeAll(list2);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
//        list.clear();
        System.out.println(list.isEmpty());

        System.out.println();
        System.out.println(list.contains(100));
        System.out.println(list.contains(90));

        System.out.println();
        list.addAll(list2);
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println(list.containsAll(list2));
        list.add(9);


        Iterator<Integer>iterator = list.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
        System.out.println();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

    }


    }
}
