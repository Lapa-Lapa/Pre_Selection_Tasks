package Part_2_2;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        TreeMap<Integer, Integer> first6 = new TreeMap<Integer, Integer>();
        for (int i = 0; i < 123456; i++) {
            first6.put(i, i);
        }
        first6.put(123457,123457);
        System.out.println("Добавляем ключ 123457 со значением 123457 число типа int в упорядоченная коллекцию");
        first6.get(123);
        System.out.println("Ищем поключу 123 значение соответствующее, и выводим его: " + first6.get(123));
        first6.remove(123);
        System.out.println("Удаляем значение по ключу 123 из коллекции");
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.print("Мы потратили " + timeSpent + " миллисекунд. " + "Размер HashSet: " + first6.size());
        //Почему хоть она и упорядоченная миллисекунд уходит на обработку разное колличество каждый раз?
        //Это же будет типичнее для не упорядоченной! Это из-за % нагрузки центрального процессора?
    }
}