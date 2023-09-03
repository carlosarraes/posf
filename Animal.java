public abstract class Animal {
  private String name;
  private int age;
  private boolean isDomesticated;
  private String[] foodItems;

  public Animal(String name, int age, boolean isDomesticated) {
    this.name = name;
    this.age = age;
    this.isDomesticated = isDomesticated;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean isDomesticated() {
    return isDomesticated;
  }

  public abstract void eat();

  public abstract void makeSound();

  public void setFoodItems(String[] foodItems) {
    this.foodItems = foodItems;
  }

  @Override
  public String toString() {
    return "Animal [name=" + name + ", age=" + age + ", isDomesticated=" + isDomesticated + "]";
  }
}
