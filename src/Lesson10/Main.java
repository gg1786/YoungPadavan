package Lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

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
        }
        System.out.println("Количество слов " + words);


        String text = scanner.nextLine();
        HashMap<String,Integer> wordsCount = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(text, ",.:;!?\t");
        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            Integer value = wordsCount.get(token);
            if (value != null)
                wordsCount.put(token, value + 1);
            else
                wordsCount.put(token, 1);
        }
        System.out.println("\ncount: %d\n"+ wordsCount.size());
        for(Map.Entry<String,Integer> entry : wordsCount.entrySet())
            System.out.println("%s -> %d\n"+ entry.getKey()+ entry.getValue());
        scanner.close();
    }
}

