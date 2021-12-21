package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Password_Strength_Whole_Password.NumberOfCharactersInterface.checksNumberOfCharacters;
import static Password_Strength_Whole_Password.NumberOfCharacters.getPasswordLength;

public class NumberOfCharactersTest {

    @Test
    public void NumberOfCharactersTestReturnValue01(){

        String someText = "some text";

        String numberOfCharacters = checksNumberOfCharacters(someText);

        Assertions.assertEquals("some text", numberOfCharacters);

    }

    @Test
    public void NumberOfCharactersTestReturnValue02(){

        String someText = "text";

        String numberOfCharacters = checksNumberOfCharacters(someText);

        Assertions.assertNotEquals("some text", numberOfCharacters);

    }

    @Test
    public void NumberOfCharactersTestReturnValue03(){

        String someText = "text";

        String numberOfCharacters = checksNumberOfCharacters(someText);

        Assertions.assertNotNull(numberOfCharacters);

    }

    @Test
    public void NumberOfCharactersTestSignNumber01(){

        String someText = "01234";

        NumberOfCharacters.checksNumberOfCharacters(someText);

        Integer passwordLength = getPasswordLength();

        Assertions.assertEquals(5, passwordLength);

    }

    @Test
    public void NumberOfCharactersTestSignNumber02(){

        String someText = "0123456789";

        NumberOfCharacters.checksNumberOfCharacters(someText);

        Integer passwordLength = getPasswordLength();

        Assertions.assertNotEquals(5, passwordLength);

    }


}
