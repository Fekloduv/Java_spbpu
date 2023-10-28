public class MyClass {
    private int value;

    // Конструктор
    public MyClass(int value) {
        this.value = value;
    }

    // Метод для обмена значениями с другим объектом
    public void swapValues(MyClass other) {
        int temp = this.value;
        this.value = other.value;
        other.value = temp;
    }

    // Геттер для получения значения
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(5);
        MyClass obj2 = new MyClass(10);

        System.out.println("До обмена:");
        System.out.println("obj1.value: " + obj1.getValue());
        System.out.println("obj2.value: " + obj2.getValue());

        // Вызываем метод для обмена значениями между объектами
        obj1.swapValues(obj2);

        System.out.println("После обмена:");
        System.out.println("obj1.value: " + obj1.getValue());
        System.out.println("obj2.value: " + obj2.getValue());
    }
}