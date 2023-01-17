package Animal;

public class Catfish extends Animal {
    @Override
    public void classification() {
        System.out.print("belongs to the class of fishes, ");
    }

    @Override
    public void voice() {
        System.out.print("doesn't make sounds ");
    }

    @Override
    public void movementType() {
        System.out.print("mode of transportation is swimming, ");
    }
}
