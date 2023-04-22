public class Radio {


    private int numberRadio;
    private int valueRadio;

    public void setNextChannel(int newNumberRadio) {
        numberRadio = newNumberRadio;

        if (newNumberRadio > 9) {
            numberRadio = 9;
        }
        if (newNumberRadio < 0) {
            numberRadio = 0;
        }

    }

    public int getNumberRadio() {

        return numberRadio;
    }

    public void next() {
        if (numberRadio < 9) {
            numberRadio += 1;
        } else numberRadio = 0;
    }

    public void prev() {
        if (numberRadio > 0) {
            numberRadio -= 1;
        } else numberRadio = 9;
    }

    public void setValueOfSound(int newValueRadio) {
        if (newValueRadio > 10) {
            newValueRadio = 10;
        }
        if (newValueRadio < 0) {
            newValueRadio = 0;
        }
        valueRadio = newValueRadio;

    }

    public int getValueSound() {

        return valueRadio;
    }

    public void increaseVolume() {
        if (valueRadio < 10) {
            valueRadio += 1;
        }
    }

    public void decreaseVolume() {
        if (valueRadio > 0) {
            valueRadio -= 1;
        }
    }

}
