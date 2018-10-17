package Part_2_1;

public class SevenSeatsCars extends Autos {
    private int doors = 5;
    private int seats = 7;
    private double tax = 0.5;

    public SevenSeatsCars() {
    }

    public SevenSeatsCars(int costOfAuto1, double fuel1) {
        setCostOfAuto(costOfAuto1);
        setFuel(fuel1);
    }

    public int Drive() {
        return 60;
    }

    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public double getTax() {
        return tax;
    }
}
