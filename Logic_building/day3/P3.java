public class P3 {
        public static void main(String []args)
        {
            int num=7;
            sum(num);
        }
    
        static void sum(int n)
        {
    
            for(int i=1;i<=100;i++)
            {
                if(i%7==0)
                {
                    System.out.println(i);
                } 
            }
        }
    }