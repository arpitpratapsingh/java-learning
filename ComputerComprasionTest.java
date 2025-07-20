public class ComputerComprasionTest {

    public static void main(String[] args) {
        for (int i = 0; i < 200000; i++) {
            boolean isFactor7 = false;
            boolean isFactor9 = false;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    if (j == 17) {
                        isFactor7 = true;
                    }
                    if (j == 19) {
                        isFactor9 = true;
                    }
                }
            }

            if (isFactor7 && isFactor9) {
                System.out.print(i + " ");
            }
        }
    }
}
