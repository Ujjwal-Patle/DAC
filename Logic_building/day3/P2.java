import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }    

    static void fact(int num)
    {
        int f = 1;
        for(int i=1; i<=num; i++)
        {
            f=f*i; 
        }
        System.out.println("Factorial :- "+f);
    }
}
