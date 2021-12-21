package Password_Strength_Whole_Password;

public class NumberOfSpecialSigns implements NumberOfSpecialSignsInterface{

    // Secure password should have at least 1 more special character

    public Integer counterOfSpecialSigns = 0;

    // Method that checks the number of special characters in the password
    public String checksNumberOfSpecialSigns(String somePassword){

        String [] specialSigns = new String[]{"~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "=", "+", "[",
                "]", "{", "}", "|", "/", ";", ":", "'", "<", ">", ",", ".", "?"};

        char[] passwordAsCharArray = somePassword.toCharArray();

        for (int i = 0; i < specialSigns.length; i++) {

            String specialSign = specialSigns[i];
            String symbol;

            for (int j = 0; j < passwordAsCharArray.length; j++) {

                symbol = String.valueOf(passwordAsCharArray[j]);

                if (specialSign.equals(symbol)) {

                    counterOfSpecialSigns++;

                }

            }

        }

        System.out.println("The password has " + counterOfSpecialSigns + " special sign/s.");

        return somePassword;

    }

    public Integer getCounterOfSpecialSigns() {
        return counterOfSpecialSigns;
    }

}
