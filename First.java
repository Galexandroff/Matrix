package Matrix;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }

        }

        int number = scanner.nextInt();
        boolean numberIsPresent = false;
        for (int r = 0; r <matrix.length; r++) {
            for (int c = 0; c <matrix[r].length ; c++) {
                if(matrix[r][c]==number){
                    System.out.println(r + " " + c);
                    numberIsPresent = true;
                }
            }
        }
        if(!numberIsPresent){
            System.out.println("not found");
        }
    }
}
