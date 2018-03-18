package Lesson4;

import java.util.Comparator;

public class CarMaxSpeed implements Comparator <Car> {
    @Override
    public int compare(Car car1, Car car2) {
        Integer speed1 = new Integer(car1.getMaxSpeed());
        Integer speed2 = new Integer(car2.getMaxSpeed());
        return speed1.compareTo(speed2);
    }
}
