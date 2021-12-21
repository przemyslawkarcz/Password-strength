package Password_Strength_Whole_Password;

public class NumberOfCapitalLetters implements NumberOfCapitalLettersInterface{

    // Secure password should have at least 1 or more capital letter

    public Integer counterOfCapitalLetters = 0;

    // Method that checks the number of capital letters in the password
    public String checksNumberOfCapitalLetters(String somePassword){

        String [] capitalLetters = new String[]{"A", "Ą", "B", "C", "Ć", "D", "E", "Ę", "F", "G", "H", "I", "J", "K", "L", "Ł", "M",
                "N", "Ń", "O", "Ó", "P", "Q", "R", "S", "Ś", "T", "U", "V", "W", "X", "Y", "Z", "Ź", "Ż"};

        char[] passwordAsCharArray = somePassword.toCharArray();

        for (int i = 0; i < capitalLetters.length; i++) {

            String capitalLetter = capitalLetters[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (capitalLetter.equals(symbol)) {
                    counterOfCapitalLetters++;
                }

            }

        }

        System.out.println("The password has " + counterOfCapitalLetters + " capital letter/s.");

        return somePassword;

    }

    public Integer getCounterOfCapitalLetters() {
        return counterOfCapitalLetters;
    }

}
