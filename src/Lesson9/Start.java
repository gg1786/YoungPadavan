package Lesson9;

import java.io.*;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader reader = new FileReader("C:\\java\\1\\Рассказ.txt");
            BufferedReader bf = new BufferedReader(reader);
            String s;
            while ((s = bf.readLine()) != null) {
                System.out.println(s);
            }
            bf.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        File file = new File("C:\\java\\1\\Рассказ.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;
            String[] array = scanner.nextLine().split(" ");
            words = words + array.length;
            System.out.println("Количество слов " + words);
            scanner.close();
        }
    }



