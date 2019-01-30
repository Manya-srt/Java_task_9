// Произведите ввод данных с клавиатуры в матрицу,
// а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.

import java.util.Scanner;

public class Task_nine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность матрицы");
        System.out.println("Количество строк матрицы");
        int n = scanner.nextInt();

        System.out.println("Количество столбцов матрицы");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        // Заполнение матрицы значениями
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Введите значение " + i + " строки, " + j + " элемента: ");
                matrix[i][j] = scanner.nextInt();}
            }
        for (int j = 0; j < m; j++) {
            int array = matrix[0][j]*3;
           System.out.print(array + " ");
        }
    }
}
