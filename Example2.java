class UnderAgeException extends RuntimeException{
    public UnderAgeException(String message){
        super(message);
    }
}
public class Example2 {
    public static void main(String[] args) {
        int age = 18;
        try {
            if(age < 18){
               throw new UnderAgeException("You can't vote.");
            }else
                System.out.println("Please Vote");
                
        } catch (UnderAgeException e) {
            System.out.println(e);
        }
    }
    
}
