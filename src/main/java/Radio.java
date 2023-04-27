public class Radio {


    private int valueRadio = 50;
    private int quantityChanelRadio = 10;
    private int numberRadio = quantityChanelRadio - 1;

    public Radio(int newQuantityChanelRadio) {
        this.quantityChanelRadio = newQuantityChanelRadio;
        this.numberRadio = newQuantityChanelRadio - 1;
    }

    public Radio() {
    }


    //устанавливаем текущую радиостанцию
    public void setNumberOfChannel(int newNumberRadio) {
        numberRadio = newNumberRadio;

        if (newNumberRadio > quantityChanelRadio) {
            numberRadio = quantityChanelRadio - 1;
        }
        if (newNumberRadio < 0) {
            numberRadio = 0;
        }

    }

    //    Показываем номер текущей станции
    public int getNumberRadio() {

        return numberRadio;
    }

    //   Показываем колличество радиостанций
    public int getQuantityChanelRadio() {

        return quantityChanelRadio;
    }

    //Переключаем радиостанцию на ПОВЫШЕНИЕ
    public void next() {
        if (numberRadio < quantityChanelRadio - 1) {
            numberRadio += 1;
        } else {
            numberRadio = 0;
        }
    }

    //Переключаем радиостанцию на ПОНИЖЕНИЕ
    public void prev() {
        if (numberRadio > 0) {
            numberRadio -= 1;
        } else {
            numberRadio = quantityChanelRadio - 1;
        }

    }


    //    Показываем громкость звука
    public int getValueSound() {

        return valueRadio;
    }

    //    Изменяем громкость на ПОВЫШЕНИЕ
    public void increaseVolume() {
        if (valueRadio < 100) {
            valueRadio += 1;
        }
    }

    //    Изменяем громкость на ПОНИЖЕНИЕ
    public void decreaseVolume() {
        if (valueRadio > 0) {
            valueRadio -= 1;
        }
    }

}
