public class New12 {
    public static void main(String[] args) {
        int a = 1000000;
        int[] arr = new int[a];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(i+" ");
        }
    }
    
}
