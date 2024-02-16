import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFileAnimals {
    public static void writeToFile(ArrayList<Animal> animalArrayList, String filename)
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            animalArrayList.stream()
                    .filter(animal -> animal.getHealth_status().equals("Sick"))
                    .map(animal -> animal.getName().toUpperCase())
                    .forEach(name -> {
                        try{
                            bw.write(name + '\n'); 
                        } catch (IOException e){
                            throw new RuntimeException(e);
                        }
                    });
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
