package MyClass2;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws PerimetrExeptoin {
        if(side<=0){
            throw new PerimetrExeptoin("Не верный ввод");
        }
        this.side = side;
    }
}
