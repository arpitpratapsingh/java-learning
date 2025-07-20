import java.util.Scanner;

public class Trial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the prime number : ");
        int a = sc.nextInt();
        for(int i = 2; i<100000 ; i++){
            boolean isPrime = true;
            for(int j = 2 ; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }

        
    }
}