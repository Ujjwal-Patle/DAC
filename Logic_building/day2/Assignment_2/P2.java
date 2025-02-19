public class P2 {

    public static void main(String[] args) 
	{
        	int day = 5; 
        	
		while(day)
		{
			switch (day) 
			{
            	case 1:
                	System.out.println("Monday");
                	switch (day) 
					{
                   		case 1:
                       		System.out.println("It is a Weekday.");
                       		break;
                	}
            		break;
            	case 2:
                	System.out.println("Tuesday");
                	switch (day) 
					{
                	   	case 2:
                	   		System.out.println("It is a Weekday.");
		        	        break;
                	}
                break;
            case 3:
               	System.out.println("Wednesday");
               	switch (day) 
				{
               	case 3:
                   		System.out.println("It is a Weekday.");
	                    break;
	           	}
	            break;
            case 4:
                System.out.println("Thursday");
                switch (day) 
				{
                	case 4:
                   		System.out.println("It is a Weekday.");
                       	break;
                }
                break;
            case 5:
                System.out.println("Friday");
                switch (day) 
				{
                	case 5:
                       	System.out.println("It is a Weekday.");
                       	break;
                }
                break;
            case 6:
                System.out.println("Saturday");
                switch (day) 
				{
                   	case 6:
                       	System.out.println("It is a Weekend.");
                       	break;
                }
                break;
            case 7:
                System.out.println("Sunday");
                switch (day) 
				{
             		case 7:
                       	System.out.println("It is a Weekend.");
                       	break;
               	}
               	break;
            default:
                	System.out.println("Invalid input");
        	}
		}
	}
}
