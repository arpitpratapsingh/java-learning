public class ArraysExaple {
    public static void main(String[] args) {
        int[][] arr[] = new int[4][4][4];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<4; j++){
                for(int k = 0; k<4; k++){
                    arr[i][j][k] = k;
                }
            }
        }
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                for(int k = 0; k<4; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    
}
