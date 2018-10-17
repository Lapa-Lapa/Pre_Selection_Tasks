package Part_2_1;

public class Autos implements Drive {
    private int doors;
    private int seats;
    private double fuel;
    private double tax;
    private int costOfAuto;

    public int Drive() {
        return 0;
    }

    public Autos() {
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getCostOfAuto() {
        return costOfAuto;
    }

    public void setCostOfAuto(int costOfAuto) {
        this.costOfAuto = costOfAuto;
    }
}