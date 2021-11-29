package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Password_Strength_Whole_Password.NumberOfCapitalLetters.getCounterOfCapitalLetters;
import static Password_Strength_Whole_Password.NumberOfCapitalLettersInterface.checksNumberOfCapitalLetters;

public class NumberOfCapitalLettersTest {

    @Test
    public void NumberOfCapitalLettersTestReturnValue01(){

        String someText = "some text";

        String numberOfCapitalLetters = checksNumberOfCapitalLetters(someText);

        Assertions.assertEquals("some text", numberOfCapitalLetters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue02(){

        String someText = "text";

        String numberOfCapitalLetters = checksNumberOfCapitalLetters(someText);

        Assertions.assertNotEquals("some text", numberOfCapitalLetters);

    }

    @Test
    public void NumberOfCapitalLettersTestReturnValue03(){

        String someText = "some text";

        String numberOfCapitalLetters = checksNumberOfCapitalLetters(someText);

        Assertions.assertNotNull(numberOfCapitalLetters);

    }

    @Test
    public void NumberOfCapitalLettersTest01(){

        String someText = "abc def ghi jkl";

        NumberOfCapitalLetters.checksNumberOfCapitalLetters(someText);
        Integer counter = getCounterOfCapitalLetters();

        Assertions.assertEquals(0, counter);

    }

    @Test
    public void NumberOfCapitalLettersTest02(){

        String someText = "ABC Def ghi jkl";

        NumberOfCapitalLetters.checksNumberOfCapitalLetters(someText);
        Integer counter = getCounterOfCapitalLetters();

        Assertions.assertEquals(4, counter);

    }

    @Test
    public void NumberOfCapitalLettersTest03(){

        String someText = "ABC Def ghi jkl";

        NumberOfCapitalLetters.checksNumberOfCapitalLetters(someText);
        Integer counter = getCounterOfCapitalLetters();

        Assertions.assertNotEquals(5, counter);

    }

}
