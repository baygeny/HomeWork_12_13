package Animal;

public abstract class Animal {
    public abstract void classification();
    public abstract void voice();
    public abstract void movementType();
    public void bodyCovering1() {
        System.out.println("body covered with hair.");
    }
    public void bodyCovering2() {
        System.out.println("body covered with scales.");
    }
    public void bodyCovering3() {
        System.out.println("body covered with feathers.");
    }

}
