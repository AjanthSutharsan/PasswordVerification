
import java.util.Scanner;
public class passwordVerification
{
    public static void check(String Password1, String Password2) {
        Scanner input = new Scanner(System.in);
        if (Password1.equals(Password2)){
            System.out.println("The passwords are the same.");
        } else{
           System.out.println("The passwords are not the same. Please re-enter your password");
           String Password3=input.nextLine();
           System.out.println("Please re-confirm your password.");
           String Password4=input.nextLine();
           Password1=Password3;
           Password2=Password4;
        }
        
       
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please type in your password.");
        String Password1 = input.nextLine();
        
        System.out.println("Please type in your password again.");
        String Password2 = input.nextLine();
        String Password3;
        String Password4;
        check(Password1, Password2);
        
        
    }
}
