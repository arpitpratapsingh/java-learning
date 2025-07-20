class DameonThread extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
        }
    }
}
public class DameonThreadLifeExample {
    public static void main(String[] args){
        
        DameonThread t = new DameonThread();
        t.setDaemon(true);
        t.start();
       System.out.println("Hello World");
        
    }
    
}
