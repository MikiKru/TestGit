package zajecia1.samochodDoGierki;

public class Track {

    private Car[] cars;


    public Track(int size) {
        this.cars = new Car[size];


    }


    public void setCarAt(int position, Car car) {
        cars[position] = car;
    }

    public boolean isCarAt(int position) {
        return cars[position] != null;

/*        if (cars[position] == null) {
            return false;
        } else {
            return true;
        }*/


    }
}
