package Password_Strength_Whole_Password;

import java.util.Scanner;

public class PasswordStrengthWholePassword {

    public void checksPasswordStrengthThroughTheWholePassword(){

        NumberOfCapitalLetters numberOfCapitalLetters = new NumberOfCapitalLetters();
        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();
        NumberOfDigits numberOfDigits = new NumberOfDigits();
        NumberOfSpecialSigns numberOfSpecialSigns = new NumberOfSpecialSigns();

        System.out.print("Enter password: ");

        Scanner enteredPassword = new Scanner(System.in);
        String password = enteredPassword.nextLine();

        numberOfCharacters.checksNumberOfCharacters(password);
        Integer passwordLength = numberOfCharacters.getPasswordLength();

        numberOfDigits.checksNumberOfDigits(password);
        Integer counterOfDigits = numberOfDigits.getCounterOfDigits();

        numberOfCapitalLetters.checksNumberOfCapitalLetters(password);
        Integer counterOfCapitalLetters = numberOfCapitalLetters.getCounterOfCapitalLetters();

        numberOfSpecialSigns.checksNumberOfSpecialSigns(password);
        Integer counterOfSpecialSigns = numberOfSpecialSigns.getCounterOfSpecialSigns();

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
