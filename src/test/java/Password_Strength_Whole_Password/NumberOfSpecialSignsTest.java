package Password_Strength_Whole_Password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSpecialSignsTest {

    @Test
    public void checksNumberOfSpecialSignsTestReturnValue01(){

        NumberOfSpecialSigns numberOfSpecialSigns = new NumberOfSpecialSigns();

        String someText = "abc";

        String number = numberOfSpecialSigns.checksNumberOfSpecialSigns(someText);

        Assertions.assertEquals("abc", number);

    }

    @Test
    public void checksNumberOfSpecialSignsTestReturnValue02(){

        NumberOfSpecialSigns numberOfSpecialSigns = new NumberOfSpecialSigns();

        String someText = "abc";

        String number = numberOfSpecialSigns.checksNumberOfSpecialSigns(someText);

        Assertions.assertNotEquals("abc ###", number);

    }

    @Test
    public void checksNumberOfSpecialSignsTestReturnValue03(){

        NumberOfSpecialSigns numberOfSpecialSigns = new NumberOfSpecialSigns();

        String someText = "abc def";

        String number = numberOfSpecialSigns.checksNumberOfSpecialSigns(someText);

        Assertions.assertNotNull(number);

    }

    @Test
    public void checksNumberOfSpecialSignsTestSpecialSignsNumber01(){

        NumberOfSpecialSigns numberOfSpecialSigns = new NumberOfSpecialSigns();

        String someText = "abc #$%";

        String number = numberOfSpecialSigns.checksNumberOfSpecialSigns(someText);

        Integer counterOfSpecialSigns = numberOfSpecialSigns.getCounterOfSpecialSigns();

        Assertions.assertEquals(3, counterOfSpecialSigns);

    }

}
