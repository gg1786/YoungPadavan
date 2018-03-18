package Lesson4;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private String name;
    private int maxSpeed;
    private double consumption;

    public Car(String name, int maxSpeed, double consumption) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                consumption == car.consumption &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, maxSpeed, consumption);
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.getName());
    }
}
