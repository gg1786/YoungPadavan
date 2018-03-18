package MyClass.Electronic;

import MyClass.Interface.ElectronicInterface;

public class Asus extends Computer implements ElectronicInterface {


    public Asus(String name, int ram, int hdd, int coast) {
        super(name, ram, hdd, coast);
    }

    @Override
    public void on() {

    }

    @Override
    public void load() {
        System.out.println("Объем памяти равен " + getRam());
    }

    @Override
    public void off() {

    }
}
