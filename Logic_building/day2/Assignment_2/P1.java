public class P1 {

	public static void main(String[] args) 
	{
        	float per = 80.6f; 
        	
		if (per >= 90 && per <= 100) 
		{
            		System.out.println("A");
        	} 
		else if (per >= 80 && per < 90) 
		{
            		System.out.println("B");
        	}
		else if (per >= 70 && per < 80) 
		{	
            		System.out.println("C");
        	} 
		else if (per >= 60 && per < 70) 
		{	
			System.out.println("D");
        	} 
		else if (per >= 0 && per < 60) 
		{
            		System.out.println("F");
        	} 
		else 
		{
            		System.out.println("Enter a valid percentage");
        	}
	}
}
