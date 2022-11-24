package Animal;

public class Eagle extends Animal implements FlyAble{
    public Eagle(String name, int speed, AnimalType animalType) {
        super(name, speed, animalType);
    }

    @Override
    public void fly() {
        System.out.println(getName()+" fly");
    }
}
