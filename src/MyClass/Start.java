package MyClass;

import MyClass.Electronic.*;
import MyClass.Interface.ElectronicInterface;

 public class Start{
public static void main(String[]args) throws CoastExeption {
//
//    Computer computer = new Computer("IBM", 512, 250, 500);
//    computer.on();
//    computer.load();
//    computer.off();
//
//    Telephone telephone = new Telephone("iPhone",900);
//   telephone.on();
//    telephone.load();
//    telephone.off();
//
//    Asus asus = new Asus("Asus 541", 512, 300, 750);
//    asus.load();
//
//    ElectronicInterface el = new TV();
//    System.out.println("Моя модель " + el.getName("LG"));
//
//    Telephone.showInfo();

    CoastItem coastItem = new CoastItem();

    try {
        coastItem.setCoast(1);
    } catch (CoastExeption e) {
        e.printStackTrace();
    }
    try {
        coastItem.setCoast(1);
    } catch (CoastExeption coastExeption) {
        coastExeption.printStackTrace();
    }

    coastItem.getCoast(-500);
}
   }
