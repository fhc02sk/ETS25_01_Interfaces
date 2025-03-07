package org.campus02.array;

import java.util.Arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        Sortable[] arr = {
                new Car(2024, "PKW", 12999),
                new Car(2023, "Truck", 200000),
                new Car(2022, "PKW", 35000)
        };

        System.out.println(Arrays.toString(arr));

        arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void arrangeOrder(Sortable[] numbers) {

        for (int j = 0; j < numbers.length; j++) {
            boolean swapped = false;
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                if (numbers[i].sort(numbers[i + 1]) > 0) {
                    // aktuelle Element ist größer als der Nachfolger
                    Sortable temp = numbers[i];
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
