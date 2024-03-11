
import java.util.Scanner;
/**
 * Основной класс программы.
 */
public class Main {

    /**
     * Точка входа в программу. Считывает строки с консоли, фильтрует их по длине и выводит отфильтрованный список строк.
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {

        String[] strings = readStringsFromConsole();
        String[] filteredStrings = filterStringsByLength(strings, 3);
        System.out.print("Отфильтрованный список строк (длина <= 3): ");
        for (String str : filteredStrings) {
            System.out.print(str + " ");
        }

    }
    /**
     * Фильтрует массив строк по длине строки.
     * @param strings массив строк для фильтрации
     * @param maxLength максимальная длина строки для фильтрации
     * @return массив отфильтрованных строк
     */
    public static String[] filterStringsByLength(String[] strings, int maxLength) {
        int count = 0;
        for (String str : strings) {
            if (str.length() <= maxLength) {
                count++;
            }
        }

        String[] filteredStrings = new String[count];
        int index = 0;
        for (String str : strings) {
            if (str.length() <= maxLength) {
                filteredStrings[index] = str;
                index++;
            }
        }

        return filteredStrings;
    }

    /**
     * Считывает строки с консоли.
     * @return массив строк, введенных с консоли
     * @throws IllegalArgumentException если количество строк меньше или равно 0
     */
    public static String[] readStringsFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count <= 0) {
            throw new IllegalArgumentException("Количество строк должно быть больше нуля.");
        }
        String[] strings = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        return strings;
    }
}
