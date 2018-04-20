package Lesson9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Start {

    public static void main(String[] args) throws FileNotFoundException {
        getWordCount("C:\\java\\1\\Рассказ.txt");
    }

    private static void getWordCount(String filename) throws FileNotFoundException {
        File file = new File("C:\\java\\1\\Рассказ.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;

        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            words = words + array.length;
            System.out.println("Количество слов " + words);
        }
    }
}







