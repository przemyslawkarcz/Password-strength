package Password_Strength_Whole_Password;

public class NumberOfCharacters implements NumberOfCharactersInterface{

    // Secure password should have at least 8 characters

    public Integer passwordLength;

    // Method that checks the number of characters in the password
    public String checksNumberOfCharacters(String somePassword){

        passwordLength = somePassword.length();

        System.out.println("Password length: " + passwordLength + " character/s.");

        return somePassword;

    }

    public Integer getPasswordLength() {
        return passwordLength;
    }

}
