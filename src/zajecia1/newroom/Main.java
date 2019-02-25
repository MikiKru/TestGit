package zajecia1.newroom;

public class Main {


    public static void main(String[] args) {

        NewRoom room = new NewRoom(5,10);
        NewRoom room2 = new NewRoom(4,1);
        NewRoom room3 = new NewRoom(3,5);
        System.out.println(room.calculateArea());
        System.out.println(room2.calculateArea());
        System.out.println(room3.calculateArea());


    }}
