public class P16 {

    public static void main(String[] args) {
        pattern();
    }
    static void pattern()
    {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j <5-1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}