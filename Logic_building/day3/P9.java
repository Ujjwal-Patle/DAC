public class P9 {
    public static void main(String[] args) {
        int num = 4895;
        System.out.println(largestDigit(num));
    }

    static int largestDigit(int n)
    {
        int max=0;
        for(int i=0;i<=n;i++)
        {
            int temp = n%10;
            
            if(temp>max)
            {
                max=temp;
            }
            n/=10;
        }

        return max;
    }
}
