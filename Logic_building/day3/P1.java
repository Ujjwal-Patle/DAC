class P1
{
    public static void main(String []args)
    {
        int a = 50;
        sum(a);
    }

    static void sum(int n)
    {
        int sum1=0;
        for(int i=0;i<=n;i++)
        {
            sum1 +=i; 
        }
        System.out.println("The sum is : "+sum1);
    }
}