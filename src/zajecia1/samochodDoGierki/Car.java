package zajecia1.samochodDoGierki;
// klasa modelujaca samochod
public class Car {
    // deklaracja pol, opisujacych samaochody,
    private String color;
    private Wheel[] kola;
    private Engine silnik;
    private int power;
    private Track tor;
    private int position;
    // konstruktor samochodu przyjmuje tor i pozycje,
    //
    public Car(Track tor, int position) {
        // this referencja do tego obiektu na ktorym jestesmy,
        // ten obiekt,
        this.tor = tor;
        this.position = position;
        // samochod dodaje sie do toru, stawia sie na torze
        tor.setCarAt(position, this);
    }

    // inna wersja konstruktora,ktora sklada smaochod z czesci ale nie umieszcza na torze
//    public Car(String color, Wheel[] kola, Engine silnik, int power) {
//        this.color = color;
//        this.kola = kola;
//        this.silnik = silnik;
//        this.power = power;
//    }


    // metoda ktora przemiszczacza samochod, o podana ilosc pol, dystans,
    void move(int distance) {
        // obliczenie na jakiej pozycji znalazl,
        // by sie samochod po przejechaniu danego dystansu
        int newPosition = position + distance;
        // detekcja kolizji, sprawdzenie czy na tej pozycji na ktora by sie przemiescil samochod, znajduje sie inny samochod
        if (tor.isCarAt(newPosition)) {
            System.out.println("bumm!!!");
            // jesli jest kolizja, rozwal samochody, usun je z toru,
            tor.setCarAt(position, null); // ten
            tor.setCarAt(newPosition, null);  // ten ktory juz jest na pozycji na ktora chcielibysmy wjechac
        } else {
            // jesli nie ma kolizji, to przemieszczamy samochod,
            System.out.printf(
                    // pierwszy to %d wartosc position, drogi  to %d wartosc new position
                    "Car moves from position %d to position %d\n",
                    position, newPosition);
          // realizacja przesuniecia, usuwamy samochod ze starej pozycji z toru,
            tor.setCarAt(position, null);
            // umieszczamy samochod na nowej pozycji na torze
            tor.setCarAt(newPosition, this);
            // aktualizujemy obecny stan pozycji samochodu ,
            // (bedzie potrzebny do obliczenia kolejnego ruchu)
            position = newPosition;
        }
    }

}