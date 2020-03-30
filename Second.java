package Matrix;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];

        for (int i = 0; i <rows ; i++) {
        String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j <line.length ; j++) {
                firstMatrix[i][j] = line[j].charAt(0);
            }
        }

        char[][] secondMatrix = new char[rows][cols];
        for (int i = 0; i <rows ; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j <line.length ; j++) {
                secondMatrix[i][j] = line[j].charAt(0);
            }
        }

        for (int r = 0; r <firstMatrix.length ; r++) {
            for (int c = 0; c <firstMatrix[r].length ; c++) {
                if(firstMatrix[r][c] != secondMatrix[r][c]){
                    firstMatrix[r][c] = '*';
                }
            }
        }
        for (int q = 0; q <firstMatrix.length ; q++) {
            for (int j = 0; j <firstMatrix[q].length ; j++) {
                System.out.print(firstMatrix[q][j] + " ");
            }
            System.out.println();
        }
    }
}
