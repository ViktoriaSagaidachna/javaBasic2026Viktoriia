package hw8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Створення масиву
        int[] values = new int[15];

        // Заповнення випадковими числами від 1 до 100
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(100) + 1;
        }

        // Виведення початкового масиву
        System.out.println("Original array: " + Arrays.toString(values));

        // Insertion Sort
        for (int i = 1; i < values.length; i++) {

            int key = values[i];
            int j = i - 1;

            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j--;
            }

            values[j + 1] = key;
        }

        // Виведення відсортованого масиву
        System.out.println("Sorted array: " + Arrays.toString(values));

        // Введення числа
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        // Binary Search
        int left = 0;
        int right = values.length - 1;
        int index = -1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (values[middle] == target) {
                index = middle;
                break;
            }

            if (values[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (index != -1) {
            System.out.println("Index of number " + target + ": " + index);
        } else {
            System.out.println("Number " + target + " not found.");
        }

        scanner.close();
    }
}
