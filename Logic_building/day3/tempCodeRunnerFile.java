public class P17 {
    public static void main(String[] args) {
        revPattern();
    }
    static void revPattern()
    {
        int n=5;
        for (int i = 0; i < n; i++) 
        {
            for(int k=0;k<i;i++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j<n-1; j++) 
            {
                System.out.print("* ");
                
            }   
            System.out.println();       
            // for(int k=0;k;k++)
        }
    }
}
