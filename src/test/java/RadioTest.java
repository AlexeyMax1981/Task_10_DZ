import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldChangeNumber(){
        Radio radio = new Radio();
        radio.changeNumber(20,10);
    }

}
