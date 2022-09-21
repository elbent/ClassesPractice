public abstract class Fish implements Swims {
    protected String type;
    protected String color;

    protected int numberOfFins;

    public Fish() {}

    public Fish(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public void greeting() {
        System.out.println("I'm a fish");
    }

    @Override
    public void swimFast() {
        System.out.println("I can swim fast");
    }
}
