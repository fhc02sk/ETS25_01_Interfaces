package org.campus02.array;

import java.util.Arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        Car[] arr = {
                new Car(2024, "PKW", 12999),
                new Car(2023, "Truck", 20000),
                new Car(2022, "PKW", 35000)
        };

        System.out.println(Arrays.toString(arr));

        arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void arrangeOrder(int[] numbers) {

        for (int j = 0; j < numbers.length; j++) {
            boolean swapped = false;
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    // aktuelle Element ist größer als der Nachfolger
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

    }
}
