public class Switch {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Неизвестный день");
        }
        char grade = '4';

        switch (grade) {
            case '5':
                System.out.println("Отлично");
                break;
            case '4':
                System.out.println("Хорошо");
                break;
            case '3':
                System.out.println("Удовлетворительно");
                break;
            default:
                System.out.println("Неизвестная оценка");
        }
        short number = 2;

        switch (number) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели неизвестное число");
                break;
        }
        String animal = "кот";

        switch (animal) {
            case "собака":
                System.out.println("Это собака");
                break;
            case "кот":
                System.out.println("Это кот");
                break;
            default:
                System.out.println("Неизвестное животное");
        }
    }
}
