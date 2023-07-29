package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    // Конструктор класса
    public DataContainer() {
        // Создаем массив для хранения элементов типа T
        data = (T[]) new Object[0];
    }

    // Метод для добавления элемента в контейнер
    public void add(T element) {
        // Создаем новый массив, увеличивая его размер на 1
        T[] newData = Arrays.copyOf(data, data.length + 1);
        newData[data.length] = element;
        data = newData;
    }

    // Метод для получения элемента по индексу
    public T get(int index) {
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("Индекс за пределами массива");
        }
        return data[index];
    }

    // Метод для сортировки элементов с помощью переданного компаратора
    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(data, comparator);
    }

    // Метод для вывода элементов на консоль
    public void print() {
        for (T element : data) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>();

        container.add("banana");
        container.add("apple");
        container.add("orange");

        System.out.println("Исходный порядок элементов:");
        container.print();

        container.sort((str1, str2) -> str2.compareTo(str1));

        System.out.println("Элементы после сортировки в обратном порядке:");
        container.print();
    }
}
