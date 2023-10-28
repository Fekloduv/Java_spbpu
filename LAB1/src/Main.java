// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) {
        // Создание строки
        String str1 = "Пример строки";

        // Получение длины строки
        int length = str1.length();
        System.out.println("Длина строки: " + length);

        // Соединение строк
        String str2 = " в Java";
        String concatenatedString = str1.concat(str2);
        System.out.println("Соединенная строка: " + concatenatedString);

        // Преобразование в верхний и нижний регистр
        String uppercase = str1.toUpperCase();
        String lowercase = str1.toLowerCase();
        System.out.println("Строка в верхнем регистре: " + uppercase);
        System.out.println("Строка в нижнем регистре: " + lowercase);
    }
}