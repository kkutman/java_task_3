import Animal.Animal;
import Transport.Transport;
import Animal.Hourse;
import Animal.AnimalType;
import Animal.Eagle;
import Transport.Bus;
import Transport.TransportType;
import Transport.Helicopter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hourse hourse1 = new Hourse("Ахилес-1",80, AnimalType.BIRD);
        Hourse hourse2 = new Hourse("Ахилес-2",80, AnimalType.BIRD);

        Eagle eagle1 = new Eagle("Гена-1",120,AnimalType.BIRD);
        Eagle eagle2 = new Eagle("Гена-2",120,AnimalType.DOMESTIC_ANIMAL);

        Bus bus1 = new Bus("11",2017, TransportType.ROAD_TRANSPORT);
        Bus bus2 = new Bus("10",2015, TransportType.ROAD_TRANSPORT);

        Helicopter helicopter1 = new  Helicopter("spaceX",2022,TransportType.AIR_TRANSPORT);
        Helicopter helicopter2 = new  Helicopter("Facebook",2022,TransportType.AIR_TRANSPORT);

        Animal[]animals1 = {hourse1,hourse2,eagle1,eagle2};


        Transport[] transport1 = {bus1,bus2,helicopter1,helicopter2};


        Transport [] transports = {bus1,bus2,helicopter1,helicopter2};
        Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
        method1(animals1,transport1,str);


    }

    public static void method1(Animal[] animals1,Transport[] transports3, String name) {
      
        Animal [] asanAnimal = new Animal[2];
        int i = 0;
        for (Animal animal:animals1){
            if (animal instanceof Hourse){
                Animal.Animal[] Hourse;
                asanAnimal[i]=Hourse[0];
            }
        }





    }
    public static void method2(Animal []animals){
        for (Animal animal:animals){
            System.out.println(animal.getSpeed());
            animal.run();
            animal.eat("chop");

        }
    }
    public static void method3(Transport [] transports){
        for (Transport transport:transports){
            transport.fuelConsumption("disel",12);

        }
    }
}