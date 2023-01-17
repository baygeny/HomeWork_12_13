package Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Catfish catfish = new Catfish();
        Raven raven = new Raven();

        System.out.print("Dog ");
        dog.classification();
        dog.voice();
        dog.movementType();
        dog.bodyCovering1();

        System.out.print("Catfish ");
        catfish.classification();
        catfish.voice();
        catfish.movementType();
        catfish.bodyCovering2();

        System.out.print("Raven ");
        raven.classification();
        raven.voice();
        raven.movementType();
        raven.bodyCovering3();

    }
}