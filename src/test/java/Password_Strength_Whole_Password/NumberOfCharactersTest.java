package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfCharactersTest {

    @Test
    public void NumberOfCharactersTestReturnValue01(){

        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();

        String someText = "some text";

        String number = numberOfCharacters.checksNumberOfCharacters(someText);

        Assertions.assertEquals("some text", number);

    }

    @Test
    public void NumberOfCharactersTestReturnValue02(){

        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();

        String someText = "text";

        String number =  numberOfCharacters.checksNumberOfCharacters(someText);

        Assertions.assertNotEquals("some text", number);

    }

    @Test
    public void NumberOfCharactersTestReturnValue03(){

        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();

        String someText = "text";

        String number = numberOfCharacters.checksNumberOfCharacters(someText);

        Assertions.assertNotNull(number);

    }

    @Test
    public void NumberOfCharactersTestSignNumber01(){

        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();

        String someText = "01234";

        numberOfCharacters.checksNumberOfCharacters(someText);

        Integer passwordLength = numberOfCharacters.getPasswordLength();

        Assertions.assertEquals(5, passwordLength);

    }

    @Test
    public void NumberOfCharactersTestSignNumber02(){

        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();

        String someText = "0123456789";

        numberOfCharacters.checksNumberOfCharacters(someText);

        Integer passwordLength = numberOfCharacters.getPasswordLength();

        Assertions.assertNotEquals(5, passwordLength);

    }

}
