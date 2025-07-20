import java.io.File;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) throws IOException {
        File f = new File("Machintosh/Users/arpitsingh/Desktop/New.txt");
        if(f.createNewFile()){
            System.out.println("Your file created");
        }else
            System.out.println("file has already created");
    }
    
}
