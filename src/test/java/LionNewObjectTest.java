import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionNewObjectTest {
    private final String sex;
    private Feline feline;
    private final String hasMane;

    public LionNewObjectTest(String sex, String hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    Lion lion;

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", "true"},
                {"Самка", "false"},
                {"Оно", "Используйте допустимые значения пола животного - самец или самка"}
        };
    }

    @Test
    public void constructorTest(){
        Exception exception = null;
        feline = new Feline();
        try {
            lion = new Lion(sex, feline);
            assertEquals(Boolean.valueOf(hasMane), lion.doesHaveMane());
        } catch (Exception e) {
            exception = e;
            assertEquals(hasMane, exception.getMessage());
        }
    }

}

