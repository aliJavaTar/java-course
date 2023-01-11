import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextTest {

    @Test
    void should_Give_FirstChar() {

        String name = "ALI";
        String lowerCase = name.toLowerCase();
        Assertions.assertEquals("ali",lowerCase);

//        String up = lowerCase.toUpperCase();
//        Assertions.assertEquals(up,lowerCase);

//       AS



    }
}
