import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        when(feline.getKittens()).thenReturn(5);
        Lion lion = new Lion("Самка", feline);
        assertEquals(5, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = Arrays.asList("Мясо", "Птицы");
        Lion lion = new Lion("Самка", feline);
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, lion.getFood());
    }
}
