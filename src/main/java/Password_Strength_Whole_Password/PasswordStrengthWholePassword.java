package Password_Strength_Whole_Password;

import java.util.Scanner;

import static Password_Strength_Whole_Password.NumberOfCapitalLetters.getCounterOfCapitalLetters;
import static Password_Strength_Whole_Password.NumberOfCharacters.getPasswordLength;
import static Password_Strength_Whole_Password.NumberOfDigits.getCounterOfDigits;
import static Password_Strength_Whole_Password.NumberOfSpecialSigns.getCounterOfSpecialSigns;

public class PasswordStrengthWholePassword {

    public static void checksPasswordStrengthThroughTheWholePassword(){

        System.out.print("Enter password: ");

        Scanner enteredPassword = new Scanner(System.in);
        String password = enteredPassword.nextLine();

        NumberOfCharacters.checksNumberOfCharacters(password);
        Integer passwordLength = getPasswordLength();

        NumberOfDigits.checksNumberOfDigits(password);
        Integer counterOfDigits = getCounterOfDigits();

        NumberOfCapitalLetters.checksNumberOfCapitalLetters(password);
        Integer counterOfCapitalLetters = getCounterOfCapitalLetters();

        NumberOfSpecialSigns.checksNumberOfSpecialSigns(password);
        Integer counterOfSpecialSigns = getCounterOfSpecialSigns();

        if (passwordLength <= 7){
            System.out.println("Very week password!");
        } else if ((passwordLength >= 8) && (counterOfDigits == 0 || counterOfCapitalLetters == 0 || counterOfSpecialSigns == 0)){
            System.out.println("Weak password!");
        } else if ((passwordLength >= 8) && (counterOfDigits == 1 || counterOfCapitalLetters == 1 || counterOfSpecialSigns == 1)){
            System.out.println("Medium strength password.");
        }else if ((passwordLength >= 8) && (counterOfDigits == 2 || counterOfCapitalLetters == 2 || counterOfSpecialSigns == 2)) {
            System.out.println("Strong password.");
        }else if ((passwordLength >= 8) && (counterOfDigits > 2 || counterOfCapitalLetters > 2 || counterOfSpecialSigns > 2)){
            System.out.println("Very strong password :)");
        }

    }

}
