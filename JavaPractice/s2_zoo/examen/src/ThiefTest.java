public class ThiefTest {
    public void test(){
        ActualCareTaker actualCareTaker = new ActualCareTaker();
        Animal animal = new Animal("bichon", "catel", 3, "nu", "healthy");
        assert (actualCareTaker.takeCareOfAnimal(animal).equals("Stealing animal" + animal.getName()));
        System.out.println("bravo");
    }
}
