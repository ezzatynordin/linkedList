package QuickSort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;

public class linkedList extends QuickSort {
    public static void main(String[] args) {
        LinkedList<String> word = new LinkedList<String>();
        try {
            //the file to be opened for reading
            FileInputStream fis = new FileInputStream("C:\\Users\\hp\\IdeaProjects\\linkedList\\src\\QuickSort\\wordList.txt");
            Scanner sc = new Scanner(fis);//file to be scanned
            //returns true if there is another line to read
            while (sc.hasNextLine()) {
                word.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException exception) {
        }

        String[] str = word.toArray(new String[0]);
        System.out.println("Word in Lexicographic Order \n");
        System.out.println("Best Case");
        QuickSort.quickSort(str, 0, 4);
        for (int k = 0; k < 4; k++) {
            System.out.println(str[k]);
        }
        System.out.println("\nAverage Case");
        QuickSort.quickSort(str, 0, 6);
        for (int k = 0; k < 6; k++) {
            System.out.println(str[k]);
        }
        System.out.println("\nWorst Case");
        QuickSort.quickSort(str, 0, 8);
        for (int k = 0; k < 8; k++) {
            System.out.println(str[k]);
        }
    }
}