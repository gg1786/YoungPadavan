package lesson6;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(23);
        Gen2<Integer> iOb2 = new Gen2<>(34);
        Gen<String> str = new Gen<>("Сообщение");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(str.getOb());
    }
}