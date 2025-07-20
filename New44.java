import java.util.Scanner;

class New44{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts");
        int a = sc.nextInt();
        int array[];
        for(int i = 0; i <= a; i++){
            array[i] = sc.nextInt();
        }
    }
}