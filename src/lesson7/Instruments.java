package lesson7;

public abstract class Instruments implements Technic <String>{

    private String name = "ERT";

    public Instruments(String name) {
        this.name = name;
    }

       public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void twist(String name) {
        System.out.println("Вызываем имя из дочернего класса " + getName()+ " , " + name);
    }
}
