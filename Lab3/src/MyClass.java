public class MyClass<T> {
    private T value;

    publi cMyClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Метод для обмена значениями с другим объектом того же класса
    public static <T> void exchangeValues(MyClass<T> obj1, MyClass<T> obj2) {
        T temp = obj1.value;
        obj1.value = obj2.value;
        obj2.value = temp;
    }

}
