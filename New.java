public class New {

    public static void main(String[] args) {
        for(int i = 0; i<1000000; i++){
            boolean isFactor7 = false;
            boolean isFactor3 = false;
            boolean isFactor11 = false;
            boolean isFactor13 = false;
            boolean isFactor17 = false;
            for(int j = 1; j<i; j++){
                if(i%j == 0){
                    if(j == 7){
                        isFactor7 = true;
                    }
                    if (j == 3) {
                        isFactor3 = true;;
                    }
                    if(j==11){
                        isFactor11 = true;
                    }
                    if (j==13) {
                        isFactor13 = true;
                    }
                    if (j == 17){
                        isFactor17 = true;
                    }
                }
                
            }
            if (isFactor7 && isFactor3 && isFactor11 && isFactor13 && isFactor17) {
                System.out.print(i+" ");
                
            }
        }
    }
}
