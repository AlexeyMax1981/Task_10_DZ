import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void showChanelOfRadioSetInConst() {
        Radio radio = new Radio(122);

        int excepted = 121;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void showChanelOfRadioSetOutConst() {
        Radio radio = new Radio();

        int excepted = 9;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void showChanelOfRadioWithSetter() {
        Radio radio = new Radio(122);
        radio.setNumberOfChannel(8);

        int excepted = 8;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void showChanelOfRadioOutConstWithSetterNegative() {
        Radio radio = new Radio();
        radio.setNumberOfChannel(-5);

        int excepted = 0;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);

    }
    @Test
    public void showChanelOfRadioBiggestQuantityInConst() {
        Radio radio = new Radio(50);
        radio.setNumberOfChannel(55);

        int excepted = 49;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);

    }
    @Test
    public void showChanelOfRadioBiggestQuantityOutConst() {
        Radio radio = new Radio();
        radio.setNumberOfChannel(55);

        int excepted = 9;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);

    }
    @Test
    public void increaseChannelRadioOutConst() {
        Radio radio = new Radio();
        radio.next();

        int excepted = 0;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void increaseChannelRadioInConst() {
        Radio radio = new Radio(100);
        radio.next();

        int excepted = 0;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void increaseChannelRadioInConstWithSetter() {
        Radio radio = new Radio(100);
        radio.setNumberOfChannel(57);
        radio.next();

        int excepted = 58;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void decreaseChannelRadioInConst() {
        Radio radio = new Radio(100);
        radio.prev();

        int excepted = 98;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void decreaseChannelRadioOutConst() {
        Radio radio = new Radio();
        radio.prev();

        int excepted = 8;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void decreaseChannelRadioInConstWithSetter() {
        Radio radio = new Radio(100);
        radio.setNumberOfChannel(34);
        radio.prev();

        int excepted = 33;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void decreaseChannelRadioOutConstWithSetterZero() {
        Radio radio = new Radio();
        radio.setNumberOfChannel(0);
        radio.prev();

        int excepted = 9;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void decreaseChannelRadioInConstWithSetterZero() {
        Radio radio = new Radio(56);
        radio.setNumberOfChannel(0);
        radio.prev();

        int excepted = 55;
        int actual = radio.getNumberRadio();
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void showQuantityChanelRadioInConst() {
        Radio radio = new Radio(122);

        int excepted = 122;
        int actual = radio.getQuantityChanelRadio();
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void showQuantityChanelRadioOutConst() {
        Radio radio = new Radio();

        int excepted = 10;
        int actual = radio.getQuantityChanelRadio();
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void showValueSound() {
        Radio radio = new Radio();
        int excepted = 50;
        int actual = radio.getValueSound();
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void shouldIncreaseValueSound() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int excepted = 51;
        int actual = radio.getValueSound();
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldDecreaseValueSound() {
        Radio radio = new Radio();
        radio.decreaseVolume();

        int excepted = 49;
        int actual = radio.getValueSound();
        Assertions.assertEquals(excepted, actual);
    }

}
