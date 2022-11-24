package Transport;

public abstract class Transport implements TransportInterface {
    //, ,
    private String name;
    private int year;
    private TransportType transportType;

    public Transport(String name, int year, TransportType transportType) {
        this.name = name;
        this.year = year;
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    @Override
    public void fuelConsumption(String fuel, int litr) {
        System.out.println(getTransportType()+" consumption "+litr+" l");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", transportType=" + transportType +
                '}';
    }
}
