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
    //stringBuilder - klasa, 1, tworzenie obiektu,

    // implementacja zamiany tor na string w celu jego wyswietlnia

    /**
     * Przykład wyniku dla tablicy 3 elementowej zawierajacej samochod na pozycji 1:
     * <pre>
     *     _C_
     * </pre>
     * @return string reprezentujacy aktualny stan toru
     */
    @Override
    public String toString() {  // toString dziedziczy po klasie object,konwertuje na string
        // uzywamy stringbuilder poniewwaz jest wydajniejszy od kankatencaji stringow,jest szybszy w dzialaniu,
        StringBuilder viewBuilder = new StringBuilder();
        // petla ktora towrzy stinga reprezentujacego aktualny stan toru,
        for (int i = 0; i < cars.length; i++){
            // jesli na pozycji nie ma samochodu to dodaj do tworzonego stringa podkreslnik, pokazujacy ze tam nic nie ma
            if (cars[i] == null){
                viewBuilder.append("_");
            } else {
                // jesli w tym miejscu jest smaochod to dodaj do stirnga C,
                //
                viewBuilder.append("C");
            }
        }
        return viewBuilder.toString();
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
