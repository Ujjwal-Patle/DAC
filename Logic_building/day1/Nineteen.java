class Nineteen {
    public static void main(String[] args) {
        System.out.print("Enter base number: ");
        int b = 3;
        int e= 4;
        int result = 1;
        
        for (int i = 1; i <= e; i++) {
            result *= b;
        }
        
        System.out.println(b + " raised to the power " + e + " is " + result);
    }
}
