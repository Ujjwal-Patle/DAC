import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        
        int failCount = 0;
         if (sub1<40) {
            failCount+=1;
         } else if (sub2<40) {
            failCount+=1;
         }else if (sub3<40) {
            failCount+=1;
         }

         switch (failCount) {
            case 0:
                System.out.println("Congratulations! You have passed all subjects.");
                break;

                default:
                System.out.println("You have failed in " + failCount + " subject(s).");
                
                switch (failCount) {
                    case 1:
                        System.out.println("Work harder! You just failed in one subject.");
                        break;
                    case 2:
                        System.out.println("You failed in two subjects. Try to improve!");
                        break;
                    case 3:
                        System.out.println("You failed in all subjects. Better luck next time!");
                        break;
                }
        }
    }
}
