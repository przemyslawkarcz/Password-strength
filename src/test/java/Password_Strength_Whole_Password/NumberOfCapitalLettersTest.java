package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfCapitalLettersTest {

    @Test
    public void NumberOfCapitalLettersTestReturnValue01(){

        NumberOfCapitalLetters numberOfCapitalLetters = new NumberOfCapitalLetters();

        String someText = "some text";

        String number = numberOfCapitalLetters.checksNumberOfCapitalLetters(someText);

        Assertions.assertEquals("some text", number);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue02(){

        NumberOfCapitalLetters numberOfCapitalLetters = new NumberOfCapitalLetters();

        String someText = "text";

        String number = numberOfCapitalLetters.checksNumberOfCapitalLetters(someText);

        Assertions.assertNotEquals("some text", number);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue03(){

        NumberOfCapitalLetters numberOfCapitalLetters = new NumberOfCapitalLetters();

        String someText = "some text";

        String number = numberOfCapitalLetters.checksNumberOfCapitalLetters(someText);

        Assertions.assertNotNull(number);

    }

    @Test
    public void NumberOfCapitalLettersTest01(){

        NumberOfCapitalLetters numberOfCapitalLetters = new NumberOfCapitalLetters();

        String someText = "abc def ghi jkl";

        numberOfCapitalLetters.checksNumberOfCapitalLetters(someText);
        Integer counter = numberOfCapitalLetters.getCounterOfCapitalLetters();

        Assertions.assertEquals(0, counter);

    }

    @Test
    public void NumberOfCapitalLettersTest02(){

        NumberOfCapitalLetters numberOfCapitalLetters = new NumberOfCapitalLetters();

        String someText = "ABC Def ghi jkl";

        numberOfCapitalLetters.checksNumberOfCapitalLetters(someText);
        Integer counter = numberOfCapitalLetters.getCounterOfCapitalLetters();

        Assertions.assertEquals(4, counter);

    }

    @Test
    public void NumberOfCapitalLettersTest03(){

        NumberOfCapitalLetters numberOfCapitalLetters = new NumberOfCapitalLetters();

        String someText = "ABC Def ghi jkl";

        numberOfCapitalLetters.checksNumberOfCapitalLetters(someText);
        Integer counter = numberOfCapitalLetters.getCounterOfCapitalLetters();;

        Assertions.assertNotEquals(5, counter);

    }

}
