public class P21 {
    public static void main(String[] args) {
        int n = 5; 
        int num = 1; 

        for (int i = 1; i <= n; i++) {
            num = 1; 
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j < i) { 
                    System.out.print("*");
                }
                num += 2; 
            }
            System.out.println();
        }
    }
}
