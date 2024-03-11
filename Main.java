import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] strings = readStringsFromConsole();
        List<String> filteredStrings = filterStringsByLength(strings, 3);
        System.out.println("Отфильтрованный список строк (длина <= 3): " + filteredStrings);

    }

    public static List<String> filterStringsByLength(String[] strings, int maxLength) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.length() <= maxLength) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }

    public static String[] readStringsFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки после ввода числа

        String[] strings = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        return strings;
    }
}