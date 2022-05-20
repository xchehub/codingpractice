public class MatrixElementsSum {
    public static int solution(int[][] matrix) {
        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // totalSum += matrix[i][j];
                if (matrix[i][j] == 0) {
                    // remove below hunted room
                    if ( i+1 < matrix.length) {
                        for (int k = i+1 ; k < matrix.length; k++) {
                            // reset to 0
                            matrix[k][j] = 0;
                        }                    
                    }
                }        
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                totalSum += matrix[i][j];
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,2}, {0,5,0,0}, {2,0,3,3}};

        System.out.println(solution(matrix));

        int[][] matrix2 = {{1}};
        System.out.println(solution(matrix2));
        
        int[][] matrix3 = {{2}, {5}, {10}};
        System.out.println(solution(matrix3));

        int[][] matrix4 = {{1, 2, 3, 4 ,5}};
        System.out.println(solution(matrix4));
    }
}
