import java.util.*;
import java.lang.*;

public class RetirementCalculator {

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int year;
        int myAge;
        int retAge;
        int remainingYears;

        year=Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        myAge=reader.nextInt();

        System.out.print("At what age would you like to retire? ");
        retAge=reader.nextInt();

        remainingYears=retAge - myAge;
        System.out.println("You have " +remainingYears + " years left until you can retire.");

        retAge = year + remainingYears;
        System.out.println("It's " +year + ", so you can retire in " +retAge+ ".");
    }
}
