import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Animal("pinguin", "p", 10, "tip1", "healthy"));
//        animals.add(new Animal("rata", "r", 10, "tip1", "healthy"));
//        animals.add(new Animal("porc", "p", 10, "tip1", "healthy"));
//        animals.add(new Animal("catel", "c", 10, "tip1", "healthy"));
//        animals.add(new Animal("pinguin", "p", 10, "tip1", "healthy"));
//
//        FilterAnimals filterAnimals = new FilterAnimals();
//        filterAnimals.animalsBySpecies(animals);
//
//        ThiefTest thiefTest = new ThiefTest();
//        thiefTest.test();
        ArrayList<Animal> animalArrayList = ReadAnimalsFromFile.readAnimalsFromFile("C:\\Users\\naomi\\MAP_SEM3\\s2_zoo\\examen\\src\\animals_inventory.csv");
        System.out.println(animalArrayList);

        WriteToFileAnimals.writeToFile(animalArrayList, "C:\\Users\\naomi\\MAP_SEM3\\s2_zoo\\examen\\src\\sick_animals.txt");

//        Animal animal = new Animal("pinguin", "p", 10, "tip1", "healthy");
//        AnimalThread animalThread = new AnimalThread();
//        animalThread.monitorAnimals(animal);
    }
}