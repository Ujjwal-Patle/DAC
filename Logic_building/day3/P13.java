public class P13 {
    public static void main(String[] args) {
        pattern1();
        pattern2();
    }
    static void pattern1()
    {
        for(int i=1;i<=5;i++)
        {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if(j<i)
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern2()
    {
        for (int i = 5; i >0 ; i--) {
            for (int j = i; j >0 ; j--) 
            {
                if(i>j)
                System.out.print(" * ");
                System.out.print(i);
                
            }
            System.out.println();
        }
    }
}
