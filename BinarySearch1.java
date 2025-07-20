import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        int arr[] = new int[100000000];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        int l = 0; 
        int h = arr.length-1;
        int mid;
        while(l<=h){
            mid = (l + h) / 2;
            if(arr[mid] == a){
                System.out.println(a+" is at index "+ mid);
                break;
            }else if (arr[mid] < a) {
                l = mid+1;
            }else
                h = mid-1;
        }
        sc.close();
        
    }
    
}
