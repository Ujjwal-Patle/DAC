public class P7 {
    public static void main(String[] args) {
        int num = 9876;

        sumOfDigits(num);
    }

    static void sumOfDigits(int n)
    {
        int sum=0;
        for (int i = 0; i <=n; i++) {
            int temp=0;
            temp = n%10;
            sum+=temp;
            n/=10;
        }
        System.out.println(sum);
    }
}
