package Animal;

public abstract class Animal implements AnimalInterface{
    // ,,
    private String name;
    private  int speed;
    private AnimalType animalType;

    public Animal(String name, int speed, AnimalType animalType) {
        this.name = name;
        this.speed = speed;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public void run() {
        System.out.println(getName()+" running "+getSpeed());
    }

    @Override
    public void eat(String food) {
        System.out.println(getName()+" eating "+ food);

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", animalType=" + animalType +
                '}';
    }
}
