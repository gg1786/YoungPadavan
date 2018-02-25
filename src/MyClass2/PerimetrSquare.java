package MyClass2;

public class PerimetrSquare {
    public void getPerimetr(){
        Square square = new Square();
        try {
            square.setSide(-3);
        } catch (PerimetrExeptoin perimetrExeptoin) {
            System.err.println("Отрицательное значение, нельзя вводить");
        }
    }
}
