import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe
{
    public ArrayList<String> coffeMenu = new ArrayList<>();


    // INSTANS METHODS
    public void loadMenuData()
    {
        try {
            File file = new File("C:\\Users\\mridr\\OneDrive\\Desktop\\Task2\\src\\coffees.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
            {
                // CREATE A VARIABLE TO HOLD THE VALUE OF THE NEXT LINE
                String line = sc.nextLine();
                // ADDING LINES TO THE ARRAY LIST
                coffeMenu.add(line);
            }
            System.out.println(coffeMenu);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found, check file pathname....");
        }




    }
}
