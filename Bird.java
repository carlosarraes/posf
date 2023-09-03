public class Bird extends Animal {
  public Bird(String name, int age, boolean isDomesticated) {
    super(name, age, isDomesticated);
  }

  public void eat() {
    System.out.println(getName() + " esta comendo.");
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " esta cantando.");
  }

  @Override
  public String toString() {
    return "Bird [name="
        + getName()
        + ", age="
        + getAge()
        + ", isDomesticated="
        + isDomesticated()
        + "]";
  }
}
