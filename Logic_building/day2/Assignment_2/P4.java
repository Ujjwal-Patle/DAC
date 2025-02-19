import java.util.Scanner;

public class P4
{
    public static void main(String[] args) 
	{
        	Scanner sc =new Scanner(System.in);

			System.out.println("Enter amount of purchase : ");
            double amount = sc.nextInt();

            System.out.println("Do you have membership ? Press y/Y for yes n/N for no");
			char member = sc.next().charAt(0);

			double discount=0;

			if (amount>=1000) 
			{
				discount = 20;
			} 
			else if (amount>500 && amount<999) 
			{
				discount = 10;
			}else
			{
				discount = 5;
			}

			if(member=='y'||member=='Y')
			{
				discount=discount+5;
			}

			double disAmount = amount*(discount/100);
			double finalAmount = amount - disAmount;

			System.out.println("Amoutn of total purchess :- "+amount);
			System.out.println("Discount % :- "+discount+" %");
			System.out.println("Discountv in Rs :- "+disAmount+"/-");
			System.out.println("Final amount of purchess:- "+finalAmount+"/-");
			
	}
}
