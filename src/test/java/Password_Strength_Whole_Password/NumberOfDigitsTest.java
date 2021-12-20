package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfDigitsTest {

    @Test
    public void numberOfDigitsTestReturnValue01(){

        String someDigits = "abcdef";

        String checksNumberOfDigits = NumberOfDigits.checksNumberOfDigits(someDigits);

        Assertions.assertEquals("abcdef", checksNumberOfDigits);

    }

    @Test
    public void numberOfDigitsTestReturnValue02(){

        String someDigits = "abc def";

        String checksNumberOfDigits = NumberOfDigits.checksNumberOfDigits(someDigits);

        Assertions.assertNotEquals("abc 123456", checksNumberOfDigits);

    }

    @Test
    public void numberOfDigitsTestReturnValue03(){

        String someDigits = "abc def ghi";

        String checksNumberOfDigits = NumberOfDigits.checksNumberOfDigits(someDigits);

        Assertions.assertNotNull(checksNumberOfDigits);

    }

    @Test
    public void numberOfDigitsTestDigitNumber01(){

        String someText = "some text without any digits";

        NumberOfDigits.checksNumberOfDigits(someText);

        Integer counterOfDigits = NumberOfDigits.getCounterOfDigits();

        Assertions.assertEquals(0, counterOfDigits);

    }

    @Test
    public void numberOfDigitsTestDigitNumber02(){

        String someText = "some text with some digits: 20122021";

        NumberOfDigits.checksNumberOfDigits(someText);

        Integer counterOfDigits = NumberOfDigits.getCounterOfDigits();

        Assertions.assertNotEquals(0, counterOfDigits);

    }


}
