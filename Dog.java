public class Dog extends Animal {
  public Dog(String name, int age, boolean isDomesticated) {
    super(name, age, isDomesticated);
  }

  public void eat() {
    System.out.println(getName() + " esta comendo.");
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " esta latindo.");
  }

  @Override
  public String toString() {
    return "Dog [name="
        + getName()
        + ", age="
        + getAge()
        + ", isDomesticated="
        + isDomesticated()
        + "]";
  }
}
