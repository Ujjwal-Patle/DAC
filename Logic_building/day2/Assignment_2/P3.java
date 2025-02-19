import java.util.Scanner;

public class P3 {

    public static void main(String[] args) 
	{
        	Scanner sc =new Scanner(System.in);

        	boolean flag = true;
		
		while(flag)
		{
			System.out.println("Enter operation you want to perform (+, -, /, *, %) or press 'x/X' to exit: ");
            char oper = sc.next().charAt(0);

            if (oper == 'x'|| oper=='X') {
                System.out.println("Exiting the calculator.");
                break;              }


			
			
			System.out.print("Enter 1st number :- ");
			int num1 = sc.nextInt();
			
			System.out.print("Enter 2nd number :- ");
			int num2 = sc.nextInt();
			
			int ans=0;
			
			switch (oper) 
			{
            	case '+':
					ans = num1 + num2;
            		break;
            	
				case '-':
                	ans = num1 - num2;
                break;
            	
				case '*':
               		ans = num1 * num2;
	            break;
            	
				case '/':
					if(num2 ==0){
						System.out.println("denominator should not be zero");
					}else
                	ans = num1/num2;
                break;
            
				case '%':
                	ans = num1%num2;
                break;

            	default:
                	System.out.println("Invalid input");
        	}
			System.out.println("Output :- "+ans);
		}
	}
}
