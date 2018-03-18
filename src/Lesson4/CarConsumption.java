package Lesson4;

import java.util.Comparator;

public class CarConsumption implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        Integer consumption1 = new Integer((int) car1.getConsumption());
        Integer consumption2 = new Integer((int) car2.getConsumption());
        return 0;
    }
}
