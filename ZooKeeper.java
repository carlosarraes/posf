import java.util.List;
import java.util.Set;

public class ZooKeeper {
  private String name;
  private int yearsOfExperience;
  private double salary;
  private Set<String> tools;

  public ZooKeeper(String name, int yearsOfExperience, double salary) {
    this.name = name;
    this.yearsOfExperience = yearsOfExperience;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public double getSalary() {
    return salary;
  }

  public void feedAnimals(List<Animal> animals) {
    for (Animal animal : animals) {
      animal.eat();
    }
  }

  public void setTools(Set<String> tools) {
    this.tools = tools;
  }

  public Set<String> getTools() {
    return tools;
  }

  @Override
  public String toString() {
    return "ZooKeeper [name="
        + name
        + ", yearsOfExperience="
        + yearsOfExperience
        + ", salary="
        + salary
        + "]";
  }
}
