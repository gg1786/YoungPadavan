package MyClass.Electronic;

import MyClass.Interface.ElectronicInterface;

public class Telephone implements ElectronicInterface{
    private String name;
    private int coast;
    private int ram;

    public static void showInfo(){
        System.out.println("Качество телефона завист, от его владельца");
    }
    public Telephone(String name, int coast) {
        this.name = name;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public int getRam() {
        return ram;
    }


    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public void on() {
        System.out.println("Нажми на кнопку вкл и высветиться мое имя " + getName());
    }

    @Override
    public void load() {
        System.out.println("Поехали, заплати " + getCoast() +"$ "+ " и наслаждайся процессом ");
    }

    @Override
    public void off() {
        System.out.println("При выключении высвечивается мое имя " + getName() );
    }
}
