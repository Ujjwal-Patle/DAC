public class P5 {
    public static void main(String[] args) {
        int num = 21;
        fibo(num);    
    }
    static void fibo(int n)
    {
        int a=0 , b=1;
        System.out.print(a+" "+b);
        for(int i=0;i<n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
        
    }
    
}
