package zajecia1.samochodDoGierki;

public class Car {
    private String color;
    private Wheel[] kola;
    private Engine silnik;
    private int power;
    private Track tor;
    private int position;

    public Car(Track tor, int position) {
        this.tor = tor;
        this.position = position;
        tor.setCarAt(position, this);
    }

    public Car(String color, Wheel[] kola, Engine silnik, int power) {
        this.color = color;
        this.kola = kola;
        this.silnik = silnik;
        this.power = power;
    }

    void move(int distance) {
        int newPosition = position + distance;
        if (tor.isCarAt(newPosition)) {
            System.out.println("bumm!!!");
            tor.setCarAt(position, null);
            tor.setCarAt(newPosition, null);
        } else {
            System.out.printf(
                    "Car moves from position %d to position %d\n",
                    position, newPosition);
            tor.setCarAt(position, null);
            tor.setCarAt(newPosition, this);
            position = newPosition;
        }
    }

}