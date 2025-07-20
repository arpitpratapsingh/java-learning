class PrimeNumbers{
    public static void main(String[] args) {
        
        int a = 5;
        int count = 2;
        for(int i = 2; i < a; i++){
            if(a%i == 0){
                count++;
            }else{
    
            }
        }
        if(count < 2){
            System.out.println("the number is a prime");
        }else{
            System.out.println("the number is not a prime");
        }
    }
}