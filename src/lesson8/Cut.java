package lesson8;

public interface Cut  {
    public <T extends Screwdriver & Cut> void cut(T drill);

}
