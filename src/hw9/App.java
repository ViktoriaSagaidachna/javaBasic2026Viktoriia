package hw9;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();

        // Створення матриці 4x4
        int[][] matrix = new int[4][4];

        // Заповнення матриці випадковими числами від 1 до 50
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        // Виведення матриці
        System.out.println("Матриця 4x4:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }


        // Сума елементів у парних та непарних рядках
        int evenRowsSum = 0;
        int oddRowsSum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i % 2 == 0) {
                    evenRowsSum += matrix[i][j];
                } else {
                    oddRowsSum += matrix[i][j];
                }
            }
        }


        // Добуток елементів у парних та непарних стовпцях
        long evenColumnsProduct = 1;
        long oddColumnsProduct = 1;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (j % 2 == 0) {
                    evenColumnsProduct *= matrix[i][j];
                } else {
                    oddColumnsProduct *= matrix[i][j];
                }
            }
        }


        // Виведення результатів
        System.out.println();

        System.out.println("Сума елементів у парних рядках (індекси 0, 2): " + evenRowsSum);
        System.out.println("Сума елементів у непарних рядках (індекси 1, 3): " + oddRowsSum);

        System.out.println("Добуток елементів у парних стовпцях (індекси 0, 2): "
                + evenColumnsProduct);

        System.out.println("Добуток елементів у непарних стовпцях (індекси 1, 3): "
                + oddColumnsProduct);



        // Перевірка чи є матриця магічним квадратом

        boolean isMagic = true;

        // Сума першого рядка - еталонна сума
        int magicSum = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            magicSum += matrix[0][j];
        }


        // Перевірка рядків
        for (int i = 1; i < matrix.length; i++) {

            int rowSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }

            if (rowSum != magicSum) {
                isMagic = false;
            }
        }


        // Перевірка стовпців
        for (int j = 0; j < matrix.length; j++) {

            int columnSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j];
            }

            if (columnSum != magicSum) {
                isMagic = false;
            }
        }


        // Перевірка головної діагоналі
        int mainDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal += matrix[i][i];
        }

        if (mainDiagonal != magicSum) {
            isMagic = false;
        }


        // Перевірка побічної діагоналі
        int secondDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            secondDiagonal += matrix[i][matrix.length - 1 - i];
        }

        if (secondDiagonal != magicSum) {
            isMagic = false;
        }


        System.out.println();

        if (isMagic) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }

    }
}