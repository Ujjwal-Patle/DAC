class Eight {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);
    }    
    public static void swap(int a, int b)
    {
        
        int temp = a + b;
        System.out.println("a = "+(temp-a));
        System.out.println("b = "+(temp-b));
    
    }
}
