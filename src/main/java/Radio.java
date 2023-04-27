public class Radio {



    private int valueRadio;
    private int quantityChanelRadio = 10;
    private int numberRadio = quantityChanelRadio-1;

    public Radio(int newQuantityChanelRadio){
        quantityChanelRadio = newQuantityChanelRadio;
    }
    public Radio(){
    }

//задаем колличество радиостанций
    public void setQuantityChanelRadio(int newQuantityChanelRadio){
        quantityChanelRadio = newQuantityChanelRadio;
        if (newQuantityChanelRadio > 10){
            quantityChanelRadio = 10;
        }
        if (newQuantityChanelRadio < 1){
            quantityChanelRadio = 1;
        }
    }


//устанавливаем текущую радиостанцию
    public void setNextChannel(int newNumberRadio) {
        numberRadio = newNumberRadio;

        if (newNumberRadio > quantityChanelRadio) {
            numberRadio = quantityChanelRadio-1;
        }
        if (newNumberRadio < 0) {
            numberRadio = 0;
        }

    }
//    Показываем номер текущую
    public int getNumberRadio() {

        return numberRadio;
    }

//   Показываем колличество радиостанций
    public int getQuantityChanelRadio(){
        return quantityChanelRadio;
    }

//Переключаем радиостанцию на ПОВЫШЕНИЕ
    public void next() {
        if (numberRadio < quantityChanelRadio-1) {
            numberRadio += 1;
        } else {numberRadio = 0;
        }
    }

//Переключаем радиостанцию на ПОНИЖЕНИЕ
    public void prev() {
        if (numberRadio > 0) {
            numberRadio -= 1;
        } else {numberRadio = quantityChanelRadio-1;
        }

    }

//    Устанавливаем громкость звука
    public void setValueOfSound(int newValueRadio) {
        if (newValueRadio > 10) {
            newValueRadio = 10;
        }
        if (newValueRadio < 0) {
            newValueRadio = 0;
        }
        valueRadio = newValueRadio;

    }


//    Показываем громкость звука
    public int getValueSound() {

        return valueRadio;
    }

//    Изменяем громкость на ПОВЫШЕНИЕ
    public void increaseVolume() {
        if (valueRadio < 10) {
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
