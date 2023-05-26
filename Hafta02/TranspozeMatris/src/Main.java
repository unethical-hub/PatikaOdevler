public class Main {
    public static void main(String[] args) {
        // İlk matrisin boyutlarını belirtin
        int rows = 2;
        int columns = 3;

        // İlk matrisi tanımlayın
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        // Matrisin transpozunu bulan fonksiyonu çağırın
        int[][] transposedMatrix = transposeMatrix(matrix, rows, columns);

        // Matrisin transpozunu ekrana yazdırın
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Matrisin transpozunu bulan fonksiyon
    public static int[][] transposeMatrix(int[][] matrix, int rows, int columns) {
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}