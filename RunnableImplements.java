class MyThreads implements Runnable{
    public void run(){
        System.out.println("Hi");
    }
}
public class RunnableImplements {
    public static void main(String[] args) {
        MyThreads t = new MyThreads();
        Thread th = new Thread(t);
        th.start();
    }
}
