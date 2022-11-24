import Animal.Animal;
import Transport.Transport;

import java.util.Arrays;

public class Person {
    // , , ,
    private String name;
    private int age;
    private Animal[] animal;
    private Transport[] transport;

    public Person(String name, int age, Animal[] animal, Transport[] transport) {
        this.name = name;
        this.age = age;
        this.animal = animal;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal[] getAnimal() {
        return animal;
    }

    public Transport[] getTransport() {
        return transport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + Arrays.toString(animal) +
                ", transport=" + Arrays.toString(transport) +
                '}';
    }
}
