package hw11;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Квадрат числа
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        // 2. Об'єм циліндра
        System.out.print("\nВведіть радіус циліндра: ");
        double radius = scanner.nextDouble();

        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();

        double volume = cylinderVolume(radius, height);
        System.out.println("Об'єм циліндра: " + volume);

        // 3. Сума елементів масиву
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\nМасив: " + Arrays.toString(numbers));
        System.out.println("Сума елементів: " + sumArray(numbers));

        scanner.nextLine(); // очищення буфера

        // 4. Рядок у зворотному порядку
        System.out.print("\nВведіть рядок: ");
        String text = scanner.nextLine();

        System.out.println("Рядок у зворотному порядку: " + reverseString(text));

        // 5. Піднесення до степеня
        System.out.print("\nВведіть число a: ");
        int a = scanner.nextInt();

        System.out.print("Введіть число b: ");
        int b = scanner.nextInt();

        System.out.println(a + "^" + b + " = " + power(a, b));

        scanner.nextLine(); // очищення буфера

        // 6. Виведення тексту n разів
        System.out.print("\nВведіть число n: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Введіть текст: ");
        String message = scanner.nextLine();

        printText(n, message);

        scanner.close();
    }

    // 1. Метод для знаходження квадрата числа
    public static void printSquare(int number) {
        System.out.println("Квадрат числа " + number + " = " + (number * number));
    }

    // 2. Метод для обчислення об'єму циліндра
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // 3. Метод для суми елементів масиву
    public static int sumArray(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    // 4. Метод для перевертання рядка
    public static String reverseString(String text) {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    // 5. Метод піднесення до степеня
    public static int power(int a, int b) {

        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }

    // 6. Метод виведення тексту n разів
    public static void printText(int n, String text) {

        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}