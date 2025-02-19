public class Twelve {
public static void main(String[] args) 
{
        int number = 12345;
        int reversed = 0, temp = number;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("The reverse of " + number + " is " + reversed);
    }
}
