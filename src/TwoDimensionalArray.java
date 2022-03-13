import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        //С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.
        int [][] array = new int[3][4];
        Scanner src = new Scanner(System.in);

        System.out.println("Введите 12 элементов двумерного массива: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = src.nextInt();
            }
        }

        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).
        int sumI;
        System.out.println("1. Номера строк и суммы их элементов: ");
        for (int i = 0; i < array.length; i++) {
            sumI = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumI += array[i][j];
            }
            System.out.printf("строка № %d. Сумма элементов: %d\n", i, sumI);
        }
        System.out.println();

        //2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
        int sumJ;
        System.out.println("2. Номера столбцов и суммы их элементов: ");
        for (int i = 0; i < array[0].length; i++) {
            sumJ = 0;
            for (int j = 0; j < array.length; j++) {
                sumJ += array[j][i];
            }
            System.out.printf("столбец № %d. Сумма элементов: %d\n", i, sumJ);
        }
        System.out.println();

        //3.Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.
        System.out.println("3. Замена нечётных элементов массива на 1, а чётных на 0: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( ( array[i][j] % 2 ) + " ");
            }
            System.out.println();
        }
        System.out.println();
        //4.Напишите программу, которая для в каждой строке находит целое среднее арифметическое и выводит его на экран.
        System.out.println("4. Целое среднее арифметическое в каждой строке: ");
        for (int i = 0; i < array.length; i++) {
            sumI = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumI += array[i][j];
            }
            System.out.printf("строка № %d. Среднее арифметическое: %d\n", i, (sumI/array[i].length) );
        }
        System.out.println();

        //5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерный и выводит все элементы одномерного массива на экран.
        int [] arrayRevers = new int[array.length * array[0].length];
        int x = 0;
        System.out.println("5. Перевернутый одномерный массив из двумерного: ");
        for (int i = array.length - 1 ; i >=0 ; --i) {
            for (int j = array[i].length - 1; j >=0 ; --j) {
                arrayRevers[x] = array[i][j];
                System.out.print(arrayRevers[x] + " ");
                x++;
            }
        }
        src.close();
    }
}
