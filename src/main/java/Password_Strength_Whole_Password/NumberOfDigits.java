package Password_Strength_Whole_Password;

public class NumberOfDigits implements NumberOfDigitsInterface{

    // Secure password should have at least 1 or 2 or more digits

    public Integer counterOfDigits = 0;

    // Method that checks the number of digits in the password
    public String checksNumberOfDigits(String somePassword){

        String [] digits = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        char[] passwordAsCharArray = somePassword.toCharArray();

        for (int i = 0; i < digits.length; i++) {

            String cipher = digits[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (cipher.equals(symbol)) {
                    counterOfDigits++;
                }

            }

        }

        System.out.println("The password has " + counterOfDigits + " digit/s.");

        return somePassword;

    }

    public Integer getCounterOfDigits() {
        return counterOfDigits;
    }

}
