package Part_2_1;

import java.util.ArrayList;
import java.util.List;

public class AutoList {
    Autos Polo3doors = new FiveSeatsCars(15000, 3, 6.5);
    Autos Polo5doors = new FiveSeatsCars(17000, 5, 6.5);
    Autos Mazda5doors = new FiveSeatsCars(21000, 5, 8.5);
    Autos BMV3doors = new FiveSeatsCars(20000, 3, 7.5);

    Autos Opel7seats = new SevenSeatsCars(20000, 10.5);
    Autos Opel7seatsOld = new SevenSeatsCars(10000, 15.5);

    Autos Bus1 = new ThirteenSeatsCars(15000, 10.5);
    Autos Bus2 = new ThirteenSeatsCars(10000, 15.5);
    Autos Bus3 = new ThirteenSeatsCars(13000, 12.5);
    Autos Bus4 = new ThirteenSeatsCars(13000, 13.5);
    Autos Bus5 = new ThirteenSeatsCars(12500, 16.5);
    Autos Bus6 = new ThirteenSeatsCars(11000, 15.5);

    List<Autos> autoList;

    public AutoList() {
        autoList= new ArrayList<Autos>();
        autoList.add(Polo3doors);
        autoList.add(Polo5doors);
        autoList.add(Mazda5doors);
        autoList.add(BMV3doors);
        autoList.add(Opel7seats);
        autoList.add(Opel7seatsOld);
        autoList.add(Bus1);
        autoList.add(Bus2);
        autoList.add(Bus3);
        autoList.add(Bus4);
        autoList.add(Bus5);
        autoList.add(Bus6);
    }

    public int Quantuty(){
        return autoList.size();
    }

    public Autos iCarFromAutoList(int i){
        return autoList.get(i);
    }

    public void setI(int i,Autos c){
        autoList.set(i,c);
    }
}
