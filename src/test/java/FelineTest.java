import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @InjectMocks
    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest(){
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittensDefaultTest(){
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void getKittensParametersTest(){
        int kittens = feline.getKittens(3);
        assertEquals(3, kittens);
    }

}
