package Lesson5;

public class Room extends House {
   public String name;


    public Room(String name,String name1) {
        super.name = name;
        this.name = name1;
    }

    void show(){
     System.out.println("Вызов из room = " + super.name);
     System.out.println("Вызов из house = " + name);
         }
    public void showInfo(){
        foo();
    }
    private void foo(){
        System.out.println("Скрытый метод");
    }

}

