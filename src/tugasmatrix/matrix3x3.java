package tugasmatrix;

public class matrix3x3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {34, 56, 41},
            {45, 36, 37},
            {51, 32, 46}
        };
        
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Zulfatun Nisa");
    }
    
}
