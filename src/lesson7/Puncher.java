package lesson7;

public class Puncher extends Instruments{

    private String name;

    public Puncher( String name) {
        super(name);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void twist(String name) {
        System.out.println("Вызываем имя из дочернего класса номер 2 "  + getName() + " , " + name);

    }


    public void beat(String name) {

    }
}
