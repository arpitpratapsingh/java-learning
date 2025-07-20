import java.util.Scanner;

public class Linear {
    public static void main(String[] args){
        int[] arr = new int[1000000000];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        boolean isPresent = false;
        for(int i = 0; i<arr.length; i++){
            if(a == arr[i]){
                isPresent = true;
                break;
            }
        }if (isPresent) {
            System.out.println("given number exist in the followin array");
            
        }else
            System.out.println("given arrray doesnt exist in the following array");

        sc.close();
    }
    
}
