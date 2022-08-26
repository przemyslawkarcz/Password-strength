package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfDigitsTest {

    @Test
    public void numberOfDigitsTestReturnValue01(){

        NumberOfDigits numberOfDigits = new NumberOfDigits();

        String someDigits = "abcdef";

        String number = numberOfDigits.checksNumberOfDigits(someDigits);

        Assertions.assertEquals("abcdef", number);

    }

    @Test
    public void numberOfDigitsTestReturnValue02(){

        NumberOfDigits numberOfDigits = new NumberOfDigits();

        String someDigits = "abc def";

        String number = numberOfDigits.checksNumberOfDigits(someDigits);

        Assertions.assertNotEquals("abc 123456", number);

    }

    @Test
    public void numberOfDigitsTestReturnValue03(){

        NumberOfDigits numberOfDigits = new NumberOfDigits();

        String someDigits = "abc def ghi";

        String number = numberOfDigits.checksNumberOfDigits(someDigits);

        Assertions.assertNotNull(number);

    }

    @Test
    public void numberOfDigitsTestDigitNumber01(){

        NumberOfDigits numberOfDigits = new NumberOfDigits();

        String someText = "some text without any digits";

        numberOfDigits.checksNumberOfDigits(someText);

        Integer counterOfDigits = numberOfDigits.getCounterOfDigits();

        Assertions.assertEquals(0, counterOfDigits);

    }

}
