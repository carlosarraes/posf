import java.util.List;

public interface IAnimal {
  void addAnimal(Animal animal) throws DuplicateAnimalException;

  void removeAnimal(Animal animal) throws AnimalException;

  void updateAnimal(Animal animal) throws AnimalException;

  List<Animal> listAnimals() throws AnimalException;
}
