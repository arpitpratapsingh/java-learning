public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] M1 = {{4,3},{2,1}};
        int[][] M2 = {{1,2},{3,4}};
        int[][] M3 = new int[2][2];
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                for(int k = 0;k != 2 ; k++){
                   M3[i][j] += M1[i][k]*M2[k][j];
                }
            }
        }
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(M3[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
