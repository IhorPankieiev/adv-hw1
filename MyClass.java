
import java.awt.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class MyClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add(" World");
        list.add("!");
        list.add(" It's");
        list.add(" me,");
        list.add(" Mario");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
