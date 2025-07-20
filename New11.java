import java.util.Scanner;

public class New11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("enter c: ");
        int c = sc.nextInt();
        for(int i = 0; i<=c; i++){
            System.out.println(a+b);
            int temp = a;
            a = b;
            b = 5;
        }
        sc.close();
    }
    
}