import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void showChanelOfRadio() {
        Radio radio = new Radio();
        radio.setNextChannel(98);

        int excepted = 9;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void increaseChannelRadio() {
        Radio radio = new Radio();
        radio.setNextChannel(10);
        radio.next();

        int excepted = 0;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void decreaseChannelRadio() {
        Radio radio = new Radio();
        radio.setNextChannel(0);
        radio.prev();

        int excepted = 9;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }


    @Test
    public void showValueSound() {
        Radio radio = new Radio();
        radio.setValueOfSound(18);


        int excepted = 10;
        int actual = radio.getValueSound();
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void shouldIncreaseValueSound() {
        Radio radio = new Radio();
        radio.setValueOfSound(-10);
        radio.increaseVolume();

        int excepted = 1;
        int actual = radio.getValueSound();
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldDecreaseValueSound() {
        Radio radio = new Radio();
        radio.setValueOfSound(0);
        radio.decreaseVolume();

        int excepted = 0;
        int actual = radio.getValueSound();
        Assertions.assertEquals(excepted, actual);
    }

}
