package columnSum;

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row size");
        int row = scanner.nextInt();
        System.out.print("Enter column size");
        int column = scanner.nextInt();
        System.out.print("Enter 2D array Elements");
        int array[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        sum(array, row, column);
    }

    public static void sum(int array[][], int row, int column) {
        for (int a = 0; a < column; a++) {
            int sum = 0;
            for (int b = 0; b < row; b++) {
                sum += array[b][a];
            }
            System.out.print(sum + " ");
        }
    }

}
