package zajecia1.newroom;

public class NewRoom {
    int width;
// konstruktor,wymusza przekazanie width,i height
    public NewRoom(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int height;
       int calculateArea(){
        return width * height;

    }

}
