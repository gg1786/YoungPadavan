package Lesson1;

public class Animal implements Cat, Dog {
    public void mew(){
        System.out.println("Я люблю мяукать");
    }

    public void bark() {
        System.out.println("Я могу укусить");
    }
}
