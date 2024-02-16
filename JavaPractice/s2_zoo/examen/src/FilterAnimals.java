import java.util.List;
import java.util.stream.Collectors;

public class FilterAnimals {

    public void animalsBySpecies(List<Animal> animals)
    {
        animals.stream()
                .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()))
                .entrySet().stream()
                .sorted((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                        .forEach(entry-> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}
