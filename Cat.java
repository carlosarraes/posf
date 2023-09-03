public class Cat extends Animal {
  public Cat(String name, int age, boolean isDomesticated) {
    super(name, age, isDomesticated);
  }

  public void eat() {
    System.out.println(getName() + " esta comendo.");
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " esta miando.");
  }

  @Override
  public String toString() {
    return "Cat [name="
        + getName()
        + ", age="
        + getAge()
        + ", isDomesticated="
        + isDomesticated()
        + "]";
  }
}
