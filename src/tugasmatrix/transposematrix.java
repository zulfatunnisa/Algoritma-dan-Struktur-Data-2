package tugasmatrix;

public class transposematrix {
    public static void main(String[] args) {
        int i, j;
        int [][] matrix = {
            {2, 1, -5},
            {3, 4, 2}
        };
        int transpose[][] = new int[matrix[0].length][matrix.length];
        System.out.println("Hasil Matrix : ");
        for(i = 0; i < matrix.length; i++){
            for(j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t"); 
            }
            System.out.println();
        }
        for(i = 0; i < matrix.length; i++){
            for(j = 0; j < matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Hasil Transpose Matrix : ");
        for(i = 0; i < matrix[0].length; i++){
            for(j = 0; j < matrix.length; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Zulfatun Nisa");
    }
}