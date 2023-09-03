import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
  private AnimalService animalService;

  public Main() {
    animalService = new AnimalService();
  }

  public static void main(String[] args) {
    Main main = new Main();
    ZooKeeper zooKeeper = new ZooKeeper("João", 10, 1000.0);

    try {
      main.animalService.loadAnimalsFromFile("animais.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado");
    }

    Bird bird = new Bird("Pardal", 1, false);
    Cat cat = new Cat("Gato", 2, true);
    Dog dog = new Dog("Cachorro", 3, true);

    main.animalService.addAnimal(bird);
    main.animalService.addAnimal(cat);
    main.animalService.addAnimal(dog);

    System.out.println(zooKeeper);

    zooKeeper.feedAnimals(main.animalService.listAnimals());

    try {
      main.animalService.saveAnimalsToFile("animais.txt");
    } catch (IOException e) {
      System.out.println("Erro ao salvar animais");
    }
  }
}
