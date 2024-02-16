import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAnimalsFromFile {
    public static ArrayList<Animal> readAnimalsFromFile(String filename) throws FileNotFoundException {

        ArrayList<Animal> animals = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String header = br.readLine();
            String line;
            while((line = br.readLine()) != null)
            {
                String[] data = line.split(",");
                Animal animal = new Animal(data[0], data[1], Long.parseLong(data[2]), data[3], data[4]);
                animals.add(animal);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return animals;
    }


}
