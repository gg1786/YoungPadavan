package lesson6;

public class Gen2<T> extends Gen {
    public Gen2( T o) {
        super(o);
    }
    Object getOb(){
        System.out.println("Метод getOb из класс Gen2");
        return ob;
    }
}
