package zajecia1.samochodDoGierki;

public class Main {
    public static void main(String[] args) {
/*        Wheel[] wheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()};
        Car car = new Car("red", wheels, new Engine(), 10);
        car.move();*/
        Track tor = new Track(100);
        Car car1 = new Car(tor, 0);
        Car car2 = new Car(tor,10);
        for(int i=0; i < 10; i++){
            car1.move(1);
        }
        System.out.println(tor);
    }
}