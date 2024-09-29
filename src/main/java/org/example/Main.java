package org.example;

import java.util.Map;

import static org.example.ElementCounter.countElements;


public class Main {
    public static void main(String[] args) {

        Object[] elements = {"Камень", 1, "Ножницы", "Камень", 1, "Бумага", "Ножницы", "Камень"};
        Map<Object, Integer> result = countElements(elements);

        System.out.println(result);
    }
}