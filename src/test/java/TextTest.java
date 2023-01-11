import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TextTest {

    @Test
    void should_Give_FirstChar() {

        String name = "ALI";
        String convertNameToLowerCase = name.toLowerCase();
        Assertions.assertEquals("ali", convertNameToLowerCase);

        String convertNameToUpper = convertNameToLowerCase.toUpperCase();

        assertThat(convertNameToUpper).isEqualTo("ALI");


//        assertThat(convertNameToLowerCase).isEqualTo("")

    }
}
