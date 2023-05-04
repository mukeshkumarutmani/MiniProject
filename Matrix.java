import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] elements = new int[row][col];

        for (int i=0; i<row; i++) {
            for (int j = 0; j <col; j++) {
                elements[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }

        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (elements[i][j] == x) {
                    System.out.println("The index found at (" + i + "," + j + ")");
                }
            }
        }
    }
}