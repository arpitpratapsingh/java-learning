public class ExceptionExample{
    public static void main(String[] args){
        System.out.println("no block");
        try{
            try {
                System.out.println(1/0);
            } finally{
                
            }
        }finally{
            System.out.println("catch block");
        }
        System.out.println("hi");

    }
}