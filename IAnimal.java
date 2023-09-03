import java.util.List;

public interface IAnimal {
  void addAnimal(Animal animal) throws DuplicateAnimalException;

  void removeAnimal(Animal animal);

  void updateAnimal(Animal animal);

  List<Animal> listAnimals();
}
