package Animal;

public class Dog extends Animal {
    @Override
    public void classification() {
        System.out.print("belongs to the class of mammals, ");
    }
    @Override
    public void voice() {
        System.out.print("makes sounds 'bark, bark', ");
    }

    @Override
    public void movementType() {
        System.out.print("mode of transportation is running, ");
    }
}
