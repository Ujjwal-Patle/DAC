public class P14 {
    public static void main(String[] args) {
        pattern();
    }
    static void pattern()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
