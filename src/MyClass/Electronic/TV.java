package MyClass.Electronic;

import MyClass.Interface.ElectronicInterface;

public class TV implements ElectronicInterface{

    private String name;
    private int ram;
    private int hdd;
    private int coast;

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public void on() {

    }

    @Override
    public void load() {

    }

    @Override
    public void off() {

    }
}
