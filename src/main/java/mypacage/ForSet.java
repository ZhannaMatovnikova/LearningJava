package mypacage;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 //у элементов set нет индекса
// нет метода get
public class ForSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(); // set  коллекция, которая хранит уникальные объекты
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        System.out.println(set.size());


        set.remove(11);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        for (int i: set) {
            System.out.println(i);
        }

//        set.clear();
        System.out.println(set.size());

        System.out.println(set.contains(10));
        System.out.println(set.contains(11));
    }
}
