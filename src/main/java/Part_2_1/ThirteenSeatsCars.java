package Part_2_1;

public class ThirteenSeatsCars extends Autos {
    private int doors = 4;
    private int seats = 13;
    private double tax = 0.48;

    public ThirteenSeatsCars() {
    }

    public ThirteenSeatsCars(int costOfAuto1, double fuel1) {
        setCostOfAuto(costOfAuto1);
        setFuel(fuel1);
    }

    public int Drive() {
        return 40;
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