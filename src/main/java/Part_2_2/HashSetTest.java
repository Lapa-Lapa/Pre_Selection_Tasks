package Part_2_2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        HashSet<Integer> first3 = new HashSet<Integer>();
        for (int i = 0; i < 123456; i++) {
            first3.add(i);
        }
        first3.add(123457);
        System.out.println("Добавляем 123457 число типа int в коллекцию");
        Iterator<Integer> iterator = first3.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 123)
                System.out.println("Ищем число 123 в коллекции, и выводим его: " + iterator.next());
        }
        first3.remove(123);
        System.out.println("Удаляем число 123 из коллекции");
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.print("Мы потратили " + timeSpent + " миллисекунд. " + "Размер HashSet: " + first3.size());
    }
}