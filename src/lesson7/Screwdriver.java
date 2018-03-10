package lesson7;

public class Screwdriver extends Instruments{
        private String name;


    public Screwdriver(String name) {
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
        System.out.println("Вызываем имя из дочернего класса " + getName()+ " , " + name );
    }


    public void beat(String name) {

    }

}

