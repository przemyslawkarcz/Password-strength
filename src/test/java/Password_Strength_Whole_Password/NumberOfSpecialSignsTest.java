package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Password_Strength_Whole_Password.NumberOfSpecialSigns.getCounterOfSpecialSigns;
import static Password_Strength_Whole_Password.NumberOfSpecialSigns.checksNumberOfSpecialSigns;

public class NumberOfSpecialSignsTest {

    @Test
    public void checksNumberOfSpecialSignsTestReturnValue01(){

        String someText = "abc";

        String numberOfSpecialSigns = checksNumberOfSpecialSigns(someText);

        Assertions.assertEquals("abc", numberOfSpecialSigns);

    }

    @Test
    public void checksNumberOfSpecialSignsTestReturnValue02(){

        String someText = "abc";

        String numberOfSpecialSigns = checksNumberOfSpecialSigns(someText);

        Assertions.assertNotEquals("abc ###", numberOfSpecialSigns);

    }

    @Test
    public void checksNumberOfSpecialSignsTestReturnValue03(){

        String someText = "abc def";

        String numberOfSpecialSigns = checksNumberOfSpecialSigns(someText);

        Assertions.assertNotNull(numberOfSpecialSigns);

    }

    @Test
    public void checksNumberOfSpecialSignsTestSpecialSignsNumber01(){

        String someText = "abc #$%";

        String numberOfSpecialSigns = checksNumberOfSpecialSigns(someText);

        Integer counterOfSpecialSigns = getCounterOfSpecialSigns();

        Assertions.assertEquals(3, counterOfSpecialSigns);

    }

}
