package zajecia1.samochodDoGierki;

public class Track {

    private Car[] cars;

    public Track(int size) {
        this.cars = new Car[size];
    }

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
