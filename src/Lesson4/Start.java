//Реализовать в классе Car из предыдущего задания интерфейс Comparable, сортирующий по марке машины.
package Lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Start {
   private static ArrayList<Car> cars = new ArrayList<>();
    public static void main (String[] args){

    Car car1 = new Car ("BMW", 220, 11);
    Car car2 = new Car ("Mersedes", 250, 15);
    Car car3 = new Car("Audi", 210, 9);
    Car car4 = new Car("VW", 190, 12);
    Car car5 = new Car("Opel", 230, 8);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        Collections.sort(cars);

        print();
    }

    private static void print() {
        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
        Car car = iterator.next();
        System.out.println(car.getName() + "," + car.getMaxSpeed() + "," +car.getConsumption() );
        }
        }
    }

