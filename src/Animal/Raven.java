package Animal;

public class Raven extends Animal {
    @Override
    public void classification() {
        System.out.print("belongs to the class of birds, ");
    }

    @Override
    public void voice() {
        System.out.print("makes sounds 'kraa, kraa', ");
    }

    @Override
    public void movementType() {
        System.out.print("mode of transportation is flying, ");
    }
}
