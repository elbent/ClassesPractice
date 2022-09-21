public class Shark extends Fish implements Swims {


    public Shark(String type, String color) {
        super(type, color);
    }

    @Override
    public void swimFast() {
        System.out.println("I'm sooooo fast!");
    }

    public void removeFin() {
        numberOfFins --;
    }
}
