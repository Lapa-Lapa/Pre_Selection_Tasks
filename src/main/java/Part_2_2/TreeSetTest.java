package Part_2_2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        TreeSet<Integer> first4 = new TreeSet<Integer>();
        for (int i = 0; i < 123456; i++) {
            first4.add(i);
        }
        first4.add(123457);
        System.out.println("Добавляем 123457 число типа int в коллекцию");
        Iterator<Integer> iterator = first4.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 123)
                System.out.println("Ищем число 123 в коллекции, и выводим его: " + iterator.next());
        }
        first4.remove(123);
        System.out.println("Удаляем число 123 из коллекции");
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.print("Мы потратили " + timeSpent + " миллисекунд. " + "Размер HashSet: " + first4.size());
    }
}