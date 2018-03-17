package lesson8;

public class  Drill extends Screwdriver implements Cut{


    public <T extends Screwdriver & Cut> void cut(T drill) {
        System.out.println(" Бить ");
    }
}

