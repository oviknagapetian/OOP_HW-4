package org.example;

public class T3 {
    // Обобщенная функция getMax
    public static <T extends Comparable<T>> T getMax(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    public static void main(String[] args) {
        // Вызов обобщенной функции getMax с разными типами данных
        Integer maxInteger = getMax(5, 10);        // Выведет: 10
        Double maxDouble = getMax(3.14, 2.71);    // Выведет: 3.14
        String maxString = getMax("apple", "banana");  // Выведет: banana

        System.out.println("Максимальное значение Integer: " + maxInteger);
        System.out.println("Максимальное значение Double: " + maxDouble);
        System.out.println("Максимальное значение String: " + maxString);
    }
}
