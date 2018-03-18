//Напишите программу, которая импортирует и использует класс java.util.ArrayList.
package Lesson3;
import java.util.ArrayList;

    public class Cyties {
        public static void main (String[] args){
    ArrayList<String> cyties = new ArrayList<String>();
    cyties.add("Брест");
    cyties.add("Могилев");
    cyties.add("Витебск");
    cyties.add("Гомель");
    cyties.add("Минск");
    cyties.add("Гродно");
    System.out.println("Мой город " + cyties.get(0));
        }
    }


