package zajecia1.samochodDoGierki;
//
public class Main {
    // uruchamia logike, 
    public static void main(String[] args) throws InterruptedException {
/*        Wheel[] wheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()};
        Car car = new Car("red", wheels, new Engine(), 10);
        car.move();*/
        // inicjalizacja obiektu tor,ktory ma 100 pozycji,
        // tor obiket po ktorym jezdza auta,Car
        Track tor = new Track(100);
        // tworzenie obiektu car na torze na pozycji 0, c
        Car car1 = new Car(tor, 0);
        // car na torze na pozycji 10
        Car car2 = new Car(tor,10);
        // wyswietlamy stan toru na poaczatku
        System.out.println(tor);
        // przemieszcza pierwszy samochod , 10 razy o 1 pole, car1
        for(int i=0; i < 10; i++){
           // chekamy 0,5 sekundy, by stowrzyc iluzje animacji,
            Thread.sleep(500);
            // odleglosc, przemieszczamy samochod o 1 pole do przodu
            car1.move(1);
            // wyswietlamy caly stan toru po przjechaniu samochodu car1
            System.out.println(tor);
        }
    }
}