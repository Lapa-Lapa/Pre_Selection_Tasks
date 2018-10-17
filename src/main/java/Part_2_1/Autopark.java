package Part_2_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Autopark {
    public static void main(String[] args) throws IOException {
        int MAX_NUMBER_OF_PASEGERS=0;
        int MAX_DESTINATION=0;

        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("Input.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                String[] array = l.split(" ");
                MAX_NUMBER_OF_PASEGERS = Integer.parseInt(array[0]);
                MAX_DESTINATION = Integer.parseInt(array[1]);
            }
        }finally {
            if (inputStream!=null){
                inputStream.close();
            }
        }

        AutoList allAutos = new AutoList();
        int all = getTotalCost(allAutos);
        System.out.println("Наш таксопарк стоит: " + all);

        sortAutosByFuelIncrease(allAutos);

        System.out.println("Введите колличество пасажиров: ");
        getScanner();
        int paramSeats = isValidParamSeats(MAX_NUMBER_OF_PASEGERS);

        System.out.println("Колличество км поездки для расчета стоимости поездки: ");
        getScanner();
        int paramDestination = isValidParamDestination(MAX_DESTINATION);

        printTax(allAutos, paramSeats, paramDestination);
    }

    public static void printTax(AutoList allAutos, int paramSeats, int paramDestination) {
        Autos carForClient;
        for (int i = 0; i < allAutos.Quantuty(); i++) {
            if (paramSeats <= allAutos.iCarFromAutoList(i).getSeats()) {
                carForClient = allAutos.iCarFromAutoList(i);
                double a = carForClient.getTax() * paramDestination;
                System.out.println("Приблизительная стоимость рассчитана и составляет: " + a + " BYN. Приятной поездки!");
                break;
            }
        }
    }

    public static int isValidParamDestination(int MAX_DESTINATION) {
        int paramDestination = 0;
        try {
            paramDestination = getScanner().nextInt();
            if (paramDestination <= 0) {
                throw new Exception("Отрицательное число или ноль");
            }
            if (paramDestination > MAX_DESTINATION) {
                throw new TooLongDistanceException("Слишком большое расстояние для поездки");
            }
        } catch (InputMismatchException e1) {
            if (e1.getClass().equals(InputMismatchException.class)) {
                System.out.println("Вы ввели не число или не целое число");
                System.exit(0);
            }
        } catch (TooLongDistanceException my) {
            System.out.println("Слишком большое расстояние для поездки");
            System.exit(0);
        } catch (Exception e2) {
            if (e2.getMessage().equals("Отрицательное число или ноль"))
                System.out.println("Вы ввели отрицательный километраж");
            System.exit(0);
        }
        return paramDestination;
    }

    public static int isValidParamSeats(int MAX_NUMBER_OF_PASEGERS) {
        int paramSeats = 0;
        try {
            paramSeats = getScanner().nextInt();
            if (paramSeats > MAX_NUMBER_OF_PASEGERS | paramSeats <= 0) {
                throw new Exception("Отрицательное число или ноль");
            }
        } catch (InputMismatchException e1) {
            if (e1.getClass().equals(InputMismatchException.class)) {
                System.out.println("Вы ввели не число");
                System.exit(0);
            }
        } catch (Exception e2) {
            if (e2.getMessage().equals("Отрицательное число или ноль"))
                System.out.println("Извините, но мы не работаем с таким колличеством пассажиров");
            System.exit(0);
        }
        return paramSeats;
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void sortAutosByFuelIncrease(AutoList allAutos) {
        for (int n = allAutos.Quantuty() - 1; n < 0; n--) {
            for (int i = 0; i < allAutos.Quantuty(); i++) {
                if (allAutos.iCarFromAutoList(i).getFuel() > allAutos.iCarFromAutoList(i + 1).getFuel()) {
                    Autos c = allAutos.iCarFromAutoList(i + 1);
                    Autos d = allAutos.iCarFromAutoList(i);
                    allAutos.setI(i + 1, d);
                    allAutos.setI(i, c);
                }
            }
        }
    }

    public static int getTotalCost(AutoList allAutos) {
        int all = 0;
        for (int i = 0; i < allAutos.Quantuty(); i++) {
            int a = allAutos.iCarFromAutoList(i).getCostOfAuto();
            all = all + a;
        }
        return all;
    }
}