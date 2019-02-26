package zajecia1.samochodDoGierki;
// klasa tor, po ktorej przemieszczaja sie samochody,
public class Track {
    // deklaracja tablicy ktora moze zawierac samochody,
    // jesli na pozycji jest null to nie ma samochodu,
    // jesli nie jest null to znjaduje sie tam samochod
    private Car[] cars;
    // konstruktor toru,ktory towrzy tor o podanej dlugosci
    public Track(int size) {
        // alokacja pamieci na tablice o rozmairze size,
        // wszystkie lelementy tablicy domyslnie sa null
        this.cars = new Car[size];
    }
    // implementacja zamiany tor na string w celu jego wyswietlnia
    @Override
    public String toString() {  // toString dziedziczy po klasie object,konwertuje na string
        String viewcar = "";
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                viewcar += "_";
            } else {
                viewcar += "C";
            }
        }
        return viewcar;
    }
    // metoda ustawiajaca samochod na danej pozycji
    public void setCarAt(int position, Car car) {
        cars[position] = car;
    }
    // metoda sprawdzjaca czy na pozycji jest samochod
    public boolean isCarAt(int position) {
        return cars[position] != null;

        // ten blok zakomentowany robi to samo,
/*        if (cars[position] == null) {
            return false;
        } else {
            return true;
        }*/


    }
}
