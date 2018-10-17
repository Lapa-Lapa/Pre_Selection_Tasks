package Part_2_1;

public class FiveSeatsCars extends Autos {

    private int seats = 5;
    private double tax = 0.6;

    public FiveSeatsCars() {
    }

    public FiveSeatsCars(int costOfAuto1, int doors1, double fuel1) {
        setCostOfAuto(costOfAuto1);
        setDoors(doors1);
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
