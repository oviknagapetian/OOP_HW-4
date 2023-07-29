package org.example;

public class T2 {
    // Обобщенный метод printArray
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Создание массивов типов Integer и String
        Integer[] integerArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "Generics", "Example"};

        // Вызов обобщенного метода printArray для каждого массива
        printArray(integerArray); // Выведет: 1 2 3 4 5
        printArray(stringArray);  // Выведет: Hello Generics Example
    }
}
