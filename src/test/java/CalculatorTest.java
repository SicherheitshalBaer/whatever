
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @BeforeAll
    public static void starttest(){
        System.out.println("Go for it");
    }

    @Test
    public void divide60by3(){
        var calc = new Calculator();
        System.out.println("What");
        assertEquals(30, calc.bruchrechnung(60, 2));
    }

    @Test
    void divide60by5() {
        var calc = new Calculator();
        System.out.println("What 2");
        assertEquals(12, calc.bruchrechnung(60, 5));
    }
}