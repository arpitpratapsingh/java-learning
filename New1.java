public class New1 {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething();
        a.doSomething(2);
    }
    
}
class A{
    void doSomething(){
        System.out.println("1");
    }
    void doSomething(int a){
        System.out.println("2");
    }
}
