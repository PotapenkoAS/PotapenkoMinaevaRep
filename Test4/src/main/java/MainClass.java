import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void IOMethod() throws FileNotFoundException {
        File file = new File("C:\\Users\\Маша\\Desctop\\Notes.txt");
        Scanner readfile = new Scanner(file);
        String temp;

        temp = readfile.nextLine();
        System.out.println(temp);


    }
}
