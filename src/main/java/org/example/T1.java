package org.example;

public class T1 {
    // Обобщенный метод printElement
    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        // Вызов обобщенного метода с различными типами данных
        Integer integerElement = 42;
        String stringElement = "Hello, Generics!";
        Double doubleElement = 3.14;

        printElement(integerElement); // Выведет: 42
        printElement(stringElement);  // Выведет: Hello, Generics!
        printElement(doubleElement);  // Выведет: 3.14
    }
}
