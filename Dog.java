public class Dog
{
  private String name;
  
  public Dog(String name)
  {
    this.name = name;
  }
  
  public String getName()
  {
    return name;
  }

  public void bark()
  {
    System.out.println("woof!");
  }
  
  public String toString()
  {
    return "Dog: " + name;
  }
}