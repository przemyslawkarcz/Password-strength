package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Password_Strength_Whole_Password.NumberOfDigits.getCounterOfDigits;
import static Password_Strength_Whole_Password.NumberOfDigits.checksNumberOfDigits;

public class NumberOfDigitsTest {

    @Test
    public void numberOfDigitsTestReturnValue01(){

        String someDigits = "abcdef";

        String checksNumberOfDigits = checksNumberOfDigits(someDigits);

        Assertions.assertEquals("abcdef", checksNumberOfDigits);

    }

    @Test
    public void numberOfDigitsTestReturnValue02(){

        String someDigits = "abc def";

        String checksNumberOfDigits = checksNumberOfDigits(someDigits);

        Assertions.assertNotEquals("abc 123456", checksNumberOfDigits);

    }

    @Test
    public void numberOfDigitsTestReturnValue03(){

        String someDigits = "abc def ghi";

        String checksNumberOfDigits = checksNumberOfDigits(someDigits);

        Assertions.assertNotNull(checksNumberOfDigits);

    }

    @Test
    public void numberOfDigitsTestDigitNumber01(){

        String someText = "some text without any digits";

        checksNumberOfDigits(someText);

        Integer counterOfDigits = getCounterOfDigits();

        Assertions.assertEquals(0, counterOfDigits);

    }

}
