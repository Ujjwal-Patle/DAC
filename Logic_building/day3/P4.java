public class P4 {
    public static void main(String[] args) {
        int num = 1234;
        reverse(num);
    }

    static void reverse(int n)
    {
        int rev=0;
        for(int i=0;i<n;)
        {
            int temp = n%10;
            rev = (rev*10)+temp;
            n = n/10; 
        }
        System.out.println("Factorial : "+rev);
    }
}
