package lesson6;
class Gen<T>{
    T ob;

    public Gen(T o) {
        ob = o;
    }

    T getOb(){
        System.out.println("Метод getOb из класс Gen");
        return ob;
    }
}

