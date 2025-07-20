import java.io.*;
public class Assignment76 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
            InputStream obj = new FileInputStream("inputoutput.java");
            System.out.println(obj.available());
            obj.close();
        
    }

    
}
