package MyClass.Electronic;

import MyClass.Interface.ElectronicInterface;

public class Computer implements ElectronicInterface{
    private String name;
    private int ram;
    private int hdd;
    private int coast;


    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast){
        this.coast = coast;
    }
    public Computer(){

    }
    public Computer(String name, int ram, int hdd, int coast) {
        this.name = name;
        this.ram = ram;

        this.hdd = hdd;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public String getName(String name) {
        return name;
    }

    public void on(){
        System.out.println("Меня зовут " + getName() + " Я включился");
    }

    public void load(){
        loadOn();
    }

    private void loadOn(){
        System.out.println("Я загружаюсь " + " обьем память " + getRam() + " и цена " + getCoast()+  "$");
    }

    public void off(){
        System.out.println("Я выключился");
    }


}
