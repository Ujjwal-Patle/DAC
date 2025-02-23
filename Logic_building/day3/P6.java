public class P6 {
    public static void main(String[] args) {
        primeNo();
    }
    
    static void primeNo()
    {
        int num=1;
        for (int i = 2; i*i <= num; i++) 
        {
            if(num%i==0)
            {
                System.out.println(i);
                num++;
            }

        }
    }
    
}
