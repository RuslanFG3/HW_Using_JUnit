import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class HW_Test {
    @Test
    public void testAbbreviatedMultiplication2() {
        int answer0 = 49, variable0 = 2, variable1 = 5;
        int test0 = Main.abbreviatedMultiplication2(variable1, variable0);
        Assertions.assertEquals(answer0, test0);
    }

    @Test
    public void testAbbreviatedMultiplication3() {
        int answer1 = 343, variable0 = 2, variable1 = 5;
        int test1 = Main.abbreviatedMultiplication3(variable0, variable1);
        Assertions.assertEquals(answer1, test1);
    }

    @Test
    public void testDegree() {
        int answer2 = 32, variable0 = 2, variable1 = 5;
        int test2 = Main.degree(variable0, variable1);
        Assertions.assertEquals(answer2, test2);
    }
}
