public class App {

    public static void main(String[] args) {
        //Fish fish1 = new Fish("tuna", "blue");
        // fish1.greeting();
        Shark shark = new Shark("hammerhead", "brown");
        shark.greeting();
        if (shark instanceof Object) {
            System.out.println("shark is an object!");
        }
        shark.swimFast();
        Salmon salmon = new Salmon("large", "pink");
        salmon.swimFast();

    }
}
