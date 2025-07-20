
public class Assignment121 {
    public static void main(String[] args) {
        try{
            int num = 10/0;
            System.out.println(num);

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Ex Occ");

        }finally{
            System.out.println("Finally block executed");
        }

    }
}
