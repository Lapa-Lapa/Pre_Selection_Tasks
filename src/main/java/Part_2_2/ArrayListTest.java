package Part_2_2;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> first2 = new ArrayList<Integer>();
        for (int i = 0; i < 123456; i++) {
            first2.add(i);
        }
        System.out.println("Добавляем 123456 число типа int в коллекцию");
        first2.get(3);
        System.out.println("Ищем 123 порядковй элемент в коллекции, он равен: " + first2.get(3));
        first2.remove(3);
        System.out.println("Удаляем 123 порядковй элемент из коллекции");
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.print("Мы потратили " + timeSpent + " миллисекунд. " + "Новый 123 элемент это: " + first2.get(10));
    }
}