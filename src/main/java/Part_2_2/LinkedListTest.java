package Part_2_2;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> first1 = new LinkedList<Integer>();
        for (int i = 0; i < 123456; i++) {
            first1.add(i);
        }
        first1.add(123456);
        System.out.println("Добавляем 123456 число типа int в коллекцию");
        first1.get(3);
        System.out.println("Ищем 123 порядковй элемент в коллекции, он равен: "+first1.get(3));
        first1.remove(3);
        System.out.println("Удаляем 123 порядковй элемент из коллекции");
        long timeSpent=System.currentTimeMillis()-startTime;
        System.out.print("Мы потратили "+timeSpent+" миллисекунд. "+"Новый 123 элемент это: "+first1.get(10));
    }
}