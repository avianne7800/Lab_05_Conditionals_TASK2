import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int BirthMonth;
        String Trash = "";
        System.out.println("Enter your birth month (1-12): ");

        if(in.hasNextInt())
        {
            BirthMonth = in.nextInt();
            in.nextLine();
            System.out.println("Your birth month is: " + BirthMonth);
        }
        else
        {
            Trash = in.nextLine();
            System.out.println("You entered " + Trash + " which is invalid.");
        }
    }
}