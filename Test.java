import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        for(int i = 0; i<a; i++){
            if(i%7==0 && i%11 == 0 && i%13 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
