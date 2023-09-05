import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnimalService implements IAnimal {
  private Map<String, Animal> animalDB = new HashMap<>();

  @Override
  public void addAnimal(Animal animal) throws DuplicateAnimalException {
    if (animalDB.containsKey(animal.getName()))
      throw new DuplicateAnimalException("Animal já existe");

    animalDB.put(animal.getName(), animal);
  }

  @Override
  public void removeAnimal(Animal animal) {
    animalDB.remove(animal.getName());
  }

  @Override
  public List<Animal> listAnimals() {
    return new ArrayList<>(animalDB.values());
  }

  @Override
  public void updateAnimal(Animal animal) {
    animalDB.put(animal.getName(), animal);
  }

  public void loadAnimalsFromFile(String filePath) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File(filePath));
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] parts = line.split(",");
      String name = parts[0];
      int age = Integer.parseInt(parts[1]);
      boolean isDomesticated = Boolean.parseBoolean(parts[2]);
      addAnimal(new Dog(name, age, isDomesticated));
    }
    scanner.close();
  }

  public void saveAnimalsToFile(String filePath) throws IOException {
    FileWriter writer = new FileWriter(new File(filePath));
    for (Animal animal : animalDB.values()) {
      writer.write(animal.toString() + "\n");
    }
    writer.close();
  }
}
