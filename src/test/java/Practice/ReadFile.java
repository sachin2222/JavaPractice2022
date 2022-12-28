package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(".\\Demo.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }


    }
}
