package Part_1_2;
import java.util.*;

public class Part_1_2 {
    public static void main(String[] args) {
        System.out.println("Введите список слов которые нужно отсорртировать по длине, раздяляя их пробелами");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] array = userInput.split(" ");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                }
            }
        }
        System.out.println("Второе по длине (по возрастанию) слово: " + array[1]);
    }
}