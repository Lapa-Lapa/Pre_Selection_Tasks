package Part_2_2;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        HashMap<Integer,Integer> first5 = new HashMap<Integer,Integer>();
        for (int i = 0; i < 123456; i++) {
            first5.put  (i,i);
        }
        first5.put(123457,123457);
        System.out.println("Добавляем ключ 123457 со значением 123457 число типа int в беспорядочеую коллекцию");
        first5.get(123);
        System.out.println("Ищем поключу 123 значение соответствующее, и выводим его: " + first5.get(123));
        first5.remove(123);
        System.out.println("Удаляем значение по ключу 123 из коллекции");
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.print("Мы потратили " + timeSpent + " миллисекунд. " + "Размер HashSet: " + first5.size());
    }
}