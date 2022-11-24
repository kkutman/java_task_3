package Transport;

import Animal.FlyAble;

public class Helicopter extends Transport implements FlyAble {
    public Helicopter(String name, int year, TransportType transportType) {
        super(name, year, transportType);
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
