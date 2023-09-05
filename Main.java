import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

public class Main {
  private AnimalService animalService;

  public Main() {
    animalService = new AnimalService();
  }

  public static void main(String[] args) {
    Main main = new Main();
    ZooKeeper zooKeeper = new ZooKeeper("João", 10, 1000.0);

    Vector<String> zooKeeperTools = new Vector<>();

    zooKeeperTools.add("Chave de fenda");
    zooKeeperTools.add("Escova");

    zooKeeper.setTools(zooKeeperTools);

    System.out.println("Tools: " + zooKeeper.getTools());

    try {
      main.animalService.loadAnimalsFromFile("animais.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado");
    }

    try {
      Bird bird = new Bird("Pardal", 1, false);
      Cat cat = new Cat("Gato", 2, true);
      Dog dog = new Dog("Cachorro", 3, true);
      main.animalService.addAnimal(bird);
      main.animalService.addAnimal(cat);
      main.animalService.addAnimal(dog);

      zooKeeper.feedAnimals(main.animalService.listAnimals());
      main.animalService.saveAnimalsToFile("animais.txt");
    } catch (IOException | ZooKeeperException e) {
      System.out.println("Erro ao salvar animais");
    }
  }
}
